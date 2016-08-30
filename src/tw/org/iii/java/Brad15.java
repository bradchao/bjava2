package tw.org.iii.java;

public class Brad15 {

	public static void main(String[] args) {
		brad:
		for (int j = 5; j > 0; j--) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + ":" + j);
				if (i==3){
					break brad;
				}
			}
		}
	}

}
