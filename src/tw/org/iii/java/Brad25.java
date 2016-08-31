package tw.org.iii.java;

public class Brad25 {

	public static void main(String[] args) {
		String a = "A123456789";
		System.out.println(a.substring(2, 3));
		
		
		TWId id1 = new TWId("O123456789");
		if (id1.isRight()){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
	}

}
