package tw.org.iii.java;

public class Brad25 {

	public static void main(String[] args) {
		TWId id1 = new TWId("A123456789");
		if (id1.isRight()){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
	}

}
