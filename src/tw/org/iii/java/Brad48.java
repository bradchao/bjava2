package tw.org.iii.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad48 {

	public static void main(String[] args) {
		try {
			InetAddress ip = 
				InetAddress.getByName("www43.brad.tw");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost");
		}
	}

}
