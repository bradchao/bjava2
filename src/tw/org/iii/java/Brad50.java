package tw.org.iii.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Brad50 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = 
				new DatagramSocket(8888);
			DatagramPacket packet = 
				new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			System.out.println("Rec OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
