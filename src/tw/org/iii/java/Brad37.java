package tw.org.iii.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad37 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout =
				new FileOutputStream("dir1/test1.txt", true);
			fout.write("1234567\n7654321\nabcdefg".getBytes());
			fout.flush();
			fout.close();
			System.out.println("Write OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}

}
