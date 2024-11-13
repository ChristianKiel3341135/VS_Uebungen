package Uebung4_1;

import java.io.*;
import java.net.Socket;

class ClientRequest implements Runnable {

    private Socket socket;
    private MessageStore store;
    public ClientRequest(Socket connection, MessageStore store) {
        this.store = store;
        this.socket = connection;
    }

    public void run() {
        try {
            while (true) {
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(outputStream, true);

                InputStream inputStream = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                String eingabe = reader.readLine();
                String command = eingabe.substring(0,3);
                String message = eingabe.substring(3);

                System.out.println("Uebung4_1.Client: " + eingabe + " cmd: " + command);
                switch (command) {
                    case "REG":
                        message = message.strip();
                        store.registerUser(message);
                        writer.println("User: " + message + " registered.");
                        writer.flush();
                        break;
                    case "SND":
                        message = message.trim();
                        store.addMessage(message);
                        writer.println("Server received: " + message);
                        writer.flush();
                        break;
                    case "RCV":
                        message = message.strip();
                        Message[] messages = store.getMessages(message);
                        if (messages != null) {
                            for(Message m : messages) {
                                writer.println(m.getSender() + ": " + m.getMessage());
                                writer.flush();
                            }
                        }
                        else{
                            writer.println("No messages received for " + message);
                            writer.flush();
                        }
                        break;
                        default:
                            writer.println("No command found. Use REG, SND, RCV");
                            writer.flush();
                            break;
                }

                if(eingabe.equals("exit")) {
                    System.out.println("Closing Socket...");
                    break;
                }
            }
            socket.close();
        }catch(IOException ioe) {
            System.out.println("Error closing client connection");
        }
    }
}
