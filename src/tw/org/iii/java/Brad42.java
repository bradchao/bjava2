package tw.org.iii.java;

import java.util.Iterator;
import java.util.TreeSet;

public class Brad42 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		while (set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
		Iterator it = set.iterator();
		while (it.hasNext()){
			Object obj = it.next();
			System.out.println((Integer)obj);
		}
		System.out.println("----");
		for(Object obj : set){
			System.out.println((Integer)obj);
		}
		
	}

}
