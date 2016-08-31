package tw.org.iii.java;

public class Brad24 {

	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = "Brad";
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s1.equals(s3));
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.equals(b2));
	}

}
