package tw.org.iii.java;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad51 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
				InetAddress.getByName("10.1.6.65"), 9999);
			
			OutputStream out = socket.getOutputStream();
			out.write("OK is KO".getBytes());
			out.flush();
			out.close();
			
			socket.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
