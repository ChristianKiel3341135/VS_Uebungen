import java.util.*;

public class MessageStore {
    //passive Klasse die Threadsafe sein muss
    private List<Message> store;
    private List<String> users;

    public MessageStore() {
        store = new ArrayList<>();
        users = new ArrayList<>();
    }

    public synchronized void registerUser(String user){
        users.add(user);
    }

    public synchronized void addMessage(String message) {
        Message msg = convertToMessage(message);
        store.add(msg);
    }

    public synchronized Message[] getMessages(String user) {
        ArrayList<Message> removedMessages = new ArrayList<>();
        Iterator<Message> iterator = store.iterator();
        while (iterator.hasNext()) {
            Message message = iterator.next();
            if (user.equals(message.getReceiver())) {
                removedMessages.add(message);
                iterator.remove();
            }
        }
        if(removedMessages.isEmpty()){
            return null;
        }
        return removedMessages.toArray(new Message[removedMessages.size()]);
    }

    //sender = parts[0], receiver = parts[1], text = parts[2];
    private Message convertToMessage(String message) {
        String[] parts = message.split("#");
        return new Message(parts[0], parts[1], parts[2]);
    }
}
