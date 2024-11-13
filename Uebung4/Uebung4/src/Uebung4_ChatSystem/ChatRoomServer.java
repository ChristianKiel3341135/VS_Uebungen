package Uebung4_ChatSystem;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatRoomServer {
    private ServerSocket serverSocket;
    private ArrayList<PrintWriter> clientWriters = new ArrayList<>();

    public static void main(String[] args) {
        ChatRoomServer ms = new ChatRoomServer();
        ms.runMessagingService();
    }

    private void runMessagingService() {
        ExecutorService es = Executors.newFixedThreadPool(10);
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Chatroom Server started...");

            while(true) {
                try {
                    Socket socket = serverSocket.accept();
                    System.out.println("Processing request...");
                    es.submit(new ClientRequest(socket, clientWriters));
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
