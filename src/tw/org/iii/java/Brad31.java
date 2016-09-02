package tw.org.iii.java;

public class Brad31 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int[] d = {1,2,3,4};
		try{
			int c = a / b;
			System.out.println(c);
			System.out.println(d[4]);
		}catch (ArithmeticException ae){
			System.out.println("Brad1");
		}catch (ArrayIndexOutOfBoundsException ae){
			System.out.println("Brad2");
		}
		System.out.println("Game Over");
	}

}
