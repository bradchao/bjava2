package tw.org.iii.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad52 {

	public static void main(String[] args) {
		try {
			ServerSocket server = 
				new ServerSocket(9999);
			Socket socket = server.accept();
			
			InputStream in = socket.getInputStream();
			int c;
			while ( (c = in.read()) != -1){
				System.out.print((char)c);
			}
			in.close();
			
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
