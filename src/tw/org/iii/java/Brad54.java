package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.BufferUnderflowException;


public class Brad54 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://a.ecimg.tw/pic/v1/data/item/201609/D/R/A/G/6/S/DRAG6S-19007D0LW000_57d0c1eba36c7.jpg");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();

			InputStream in = conn.getInputStream();
			FileOutputStream fout = 
				new FileOutputStream("dir1/brad2.jpg");
			byte[] buf = new byte[4096]; int len;
			while ( (len = in.read(buf)) !=-1){
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			in.close();
			System.out.println("OK");
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
