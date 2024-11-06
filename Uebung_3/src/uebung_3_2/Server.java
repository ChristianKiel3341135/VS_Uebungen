package uebung_3_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements Runnable{
    private ServerSocket serverSocket;

    public Server(ServerSocket socket) {
        this.serverSocket = socket;
    }

    public static void main(String[] args) {
        int cnt = 10;
        ExecutorService es = Executors.newFixedThreadPool(cnt);
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Webserver started...");
                while (true) {
                    es.execute(new Server(serverSocket));
                }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            es.shutdown();
        }
    }

    @Override
    public void run() {
            try{
                Socket socket = this.serverSocket.accept();
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(outputStream); //Daten an den uebung_3_1a.Client senden
                System.out.println("Current working directory: " + System.getProperty("user.dir"));
                List<String> file = Files.readAllLines(Path.of("Uebung_3\\src\\uebung_3_2\\index.html"));

                // HTTP Statuszeile und Header senden
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/html; charset=UTF-8");
                writer.println();

                for(String line : file) {
                    writer.println(line);
                    writer.flush();
                }
                socket.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
    }
}
