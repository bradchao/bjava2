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
			URL url = new URL("http://pdfmyurl.com/?url=http://www.gamer.com.tw");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();

			InputStream in = conn.getInputStream();
			FileOutputStream fout = 
				new FileOutputStream("dir1/gamer.pdf");
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
