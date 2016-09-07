package tw.org.iii.java;

import java.io.IOException;
import java.net.ServerSocket;

public class Brad52 {

	public static void main(String[] args) {
		try {
			ServerSocket server = 
				new ServerSocket(9999);
			server.accept();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
