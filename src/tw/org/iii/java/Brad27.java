package tw.org.iii.java;

public class Brad27 {
	public static void main(String[] args) {
		Brad271 obj1 = new Brad271();
		obj1.m1();
		Brad272 obj2 = new Brad272();
		obj2.m1();
		obj2.m2();
	}
}
class Brad271 {
	int a;
	void m1(){System.out.println("Brad271:m1()");}
}
class Brad272 extends Brad271 {
	void m1(){
		super.m1();
		System.out.println("Brad272:m1():" + a);
	}
	void m2(){System.out.println("Brad272:m2()");}
}
