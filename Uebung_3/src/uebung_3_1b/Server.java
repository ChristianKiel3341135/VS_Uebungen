package uebung_3_1b;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(8888);
            byte[] buffer = new byte[100];
            while (true) {
                DatagramPacket DpReceive = new DatagramPacket(buffer, buffer.length);

                socket.receive(DpReceive);

                System.out.println("Client:-" + ConvertByteToString(buffer));

                if (ConvertByteToString(buffer).toString().equals("Ende"))
                {
                    System.out.println("Client hat Ende gesendet... Server wird gestoppt");
                    break;
                }
                //clear buffer
                buffer = new byte[100];
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder ConvertByteToString(byte[] a)
    {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0)
        {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
