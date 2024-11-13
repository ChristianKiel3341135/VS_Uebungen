import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1", 8080);

            InputStream in = s.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            OutputStream out = s.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            Scanner scanner = new Scanner(System.in);
            //schicken an server
            new Thread (() -> {
                while(true) {
                    String eingabe = scanner.nextLine();
                    writer.println(eingabe);
                    writer.flush();
                    if(eingabe.equals("exit")) {
                        System.out.println("Client stopped");
                        System.exit(0);
                    }
                }
            }).start();

            //empfangen von server
            new Thread (() -> {
                String antwort;
                while(true) {
                    try {
                        antwort = reader.readLine();
                        //if(antwort != null) {
                            System.out.println(antwort);
                        //}
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
