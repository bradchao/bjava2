package tw.org.iii.java;

import java.util.HashSet;

public class Brad42 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		while (set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
	}

}
