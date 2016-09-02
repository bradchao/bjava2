package tw.org.iii.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad35 {

	public static void main(String[] args) {
		File f1 = new File("dir1/brad.txt");
		try {
			FileInputStream fis = new FileInputStream(f1);
			int c; byte[] buf = new byte[3];
			while ( (c = fis.read(buf)) != -1){
				System.out.print(new String(buf,0,c));
			}
			
			
			fis.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
