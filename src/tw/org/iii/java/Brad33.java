package tw.org.iii.java;

public class Brad33 {

	public static void main(String[] args) {
		Brad331 obj1 = new Brad331();
		obj1.m1();
	}

}
class Brad331 {
	void m1(){
		int a = 10, b = 0;
		try{
			System.out.println(a/b);
			return;
//		}catch(Exception e){
//			System.out.println("Brad");
//			return;
		}finally {
			System.out.println("Finally");
		}
		//System.out.println("Game Over");
	}
}
