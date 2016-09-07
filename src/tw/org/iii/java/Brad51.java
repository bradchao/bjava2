package tw.org.iii.java;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Brad51 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
				InetAddress.getByName("10.1.6.65"), 9999);
			socket.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
