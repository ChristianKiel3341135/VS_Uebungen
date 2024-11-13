package Uebung4_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessagingService{
    private ServerSocket serverSocket;
    private MessageStore messageStore;

    public MessagingService(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    public static void main(String[] args) {
        MessageStore store = new MessageStore();
        MessagingService ms = new MessagingService(store);
        ms.runMessagingService();
    }

    private void runMessagingService() {
        ExecutorService es = Executors.newFixedThreadPool(10);
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Uebung4_1.MessagingService started...");

            while(true) {
                try {
                    Socket socket = serverSocket.accept();
                    System.out.println("Processing request...");
                    es.submit(new ClientRequest(socket,messageStore));
                } catch(IOException ioe) {
                    System.out.println("Error accepting connection");
                    ioe.printStackTrace();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            es.shutdown();
        }
    }
}
