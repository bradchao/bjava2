package tw.org.iii.java;

public class Brad12 {

	public static void main(String[] args) {
		int a = 10;
		final int b = 8;
		switch(a){
			case 1:
				System.out.println("A");
				break;
			case 10:
				System.out.println("B");
				//break;
			case b+3:
				System.out.println("C");
				//break;
			default:
				System.out.println("D");
				break;
		}
		
		
		
		
		
	}

}
