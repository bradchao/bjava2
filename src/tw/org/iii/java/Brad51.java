package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad51 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
				InetAddress.getByName("10.1.6.65"), 9999);
			
			FileInputStream fin = 
				new FileInputStream("dir1/coffee.jpg");
			OutputStream out = socket.getOutputStream();

			int b;
			while ( (b = fin.read()) != -1){
				out.write(b);
			}
			
			out.flush();
			out.close();
			
			fin.close();
			
			socket.close();
			System.out.println("Send OK!");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
