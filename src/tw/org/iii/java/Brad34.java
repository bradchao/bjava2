package tw.org.iii.java;

import java.io.File;

public class Brad34 {
	public static void main(String[] brad){
		File file1 = new File("c:/king");
		if (file1.exists()){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
	}
}
