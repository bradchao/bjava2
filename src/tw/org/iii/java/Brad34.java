package tw.org.iii.java;

import java.io.File;
import java.io.IOException;

public class Brad34 {
	public static void main(String[] brad){
		File file1 = new File("c:/king/file1");
		if (file1.isFile()){
			System.out.println("OK");
		}else{
			try{
				if (file1.createNewFile()){
					System.out.println("Create OK");
				}else{
					System.out.println("Create Fail");
				}
			}catch(IOException ie){
				System.out.println();
			}
		}
		
		File file2 = new File("c:/test/dir1/dir2/dir3/dir4");
		if (!file2.isDirectory()){
			file2.mkdirs();
		}
		
		File f1 = new File("c:/test");
		File f2 = new File("c:/test");
		System.out.println(f1 == f2);
		
		File[] roots = File.listRoots();
		for (File root : roots){
			System.out.println(root.getAbsolutePath());
		}
		
		
		
		
		
	}
}
