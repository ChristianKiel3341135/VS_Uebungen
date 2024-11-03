package uebung_3_1a;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1", 8888);

            InputStream in = s.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in)); //Vom uebung_3_1a.Server Daten empfangen

            OutputStream out = s.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true); //uebung_3_1a.Client zu uebung_3_1a.Server Daten senden

            for (int i = 0; i < args.length; i++) {
                writer.println(args[i]);
                writer.flush();
            }

            Scanner scanner = new Scanner(System.in);
            String eingabe = scanner.nextLine();
            writer.println(eingabe);
            writer.flush();
            String eingang = reader.readLine();
            System.out.println("Vom uebung_3_1a.Server erhalten: " + eingang);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
