package uebung_3_3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1", 1212);

            InputStream in = s.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in)); //Vom uebung_3_1a.Server Daten empfangen

            OutputStream out = s.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true); //uebung_3_1a.Client zu uebung_3_1a.Server Daten senden

            new Thread (() -> {
                while(true) {
                    Scanner scanner = new Scanner(System.in);
                    String eingabe = scanner.nextLine();
                    writer.println(eingabe);
                    writer.flush();
                }
            }).start();

            new Thread (() -> {
                while(true) {
                    try {
                        System.out.println(reader.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            }).start();



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
