package tw.org.iii.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Brad49 {

	public static void main(String[] args) {
		String data = "Hello, Brad";
		byte[] buf = data.getBytes();
		try {
			DatagramSocket socket = 
				new DatagramSocket();
			DatagramPacket packet =
				new DatagramPacket(buf, buf.length,
					InetAddress.getByName("10.1.6.65"),8888);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
