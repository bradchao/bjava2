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
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
