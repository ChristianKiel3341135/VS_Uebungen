package uebung_3_1a;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;

    public Server(int port) {
        this.port = port;
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("uebung_3_1a.Server started");
            while(true) {
                try{
                    Socket socket = serverSocket.accept();
                    InputStream inputStream = socket.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); //Daten vom uebung_3_1a.Client

                    OutputStream outputStream = socket.getOutputStream();
                    PrintWriter writer = new PrintWriter(outputStream); //Daten an den uebung_3_1a.Client senden

                    String userName = reader.readLine();
                    String passwort = reader.readLine();
                    System.out.println("Anmeldung von: " + userName + " " + passwort);
                    String antwort = reader.readLine();
                    System.out.println("Von uebung_3_1a.Client: " + antwort);

                    writer.println("Clientnachricht vom uebung_3_1a.Server verarbeitet: " + antwort );
                    writer.flush();
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
