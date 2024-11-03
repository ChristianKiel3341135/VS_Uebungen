package uebung_3_1b;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            String input = sc.nextLine();
            byte[] buffer = input.getBytes();
            if(buffer.length <= 100){
                socket.send(new DatagramPacket(buffer, buffer.length, ip, 8888));
            }
            else System.out.println("Nachricht zu groß. Nachricht darf max. 100 Byte groß sein");

        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
