package Uebung4_ChatSystem;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

class ClientRequest implements Runnable {

    private Socket socket;
    private final ArrayList<PrintWriter> writers;
    private String currUser;
    private PrintWriter currWriter;
    public ClientRequest(Socket connection, ArrayList<PrintWriter> writers) {
        this.socket = connection;
        this.writers = writers;
    }

    public void run() {
        try {
            OutputStream outputStream = socket.getOutputStream();
            currWriter = new PrintWriter(outputStream, true);

            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            synchronized (writers) {
                writers.add(currWriter);
            }
            while (true) {
                String eingabe = reader.readLine();
                String command = eingabe.substring(0,4);
                String inhalt = eingabe.substring(4);

                System.out.println("Client: " + eingabe + " cmd: " + command);
                switch (command) {
                    case "OPEN":
                        currUser = inhalt;
                        broadcastMessage("ADMN"+ currUser + " has entered the chat!");
                        break;
                    case "PUBL":
                        //ergibt: SHOW#USER#MESSAGE
                        String message = "SHOW" + currUser + inhalt;
                        broadcastMessage(message);
                        break;

                        default:
                            currWriter.println("No correct command found.");
                            currWriter.flush();
                            break;
                }

                if(eingabe.equals("EXIT")) {
                    System.out.println("Closing Socket...");
                    break;
                }
            }
            socket.close();
        }catch(IOException ioe) {
            System.out.println("Error closing client connection");
        }
    }

    private void broadcastMessage(String message) {
        synchronized (writers) {
            for (PrintWriter clientWriter : writers) {
                if(!clientWriter.equals(currWriter)) {
                    clientWriter.println(message);
                    clientWriter.flush();
                }
            }
        }
    }

}
