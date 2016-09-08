package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.BufferUnderflowException;


public class Brad55 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://127.0.0.1/addData.php?cname=eric&tel=321&birthday=1999-02-03");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			conn.getInputStream();

			System.out.println("OK");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
