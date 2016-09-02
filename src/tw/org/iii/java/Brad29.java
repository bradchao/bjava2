package tw.org.iii.java;

public class Brad29 {
	public static void main(String[] args) {
		Brad292 obj1 = new Brad292();
		Brad293 obj2 = new Brad293();
		
		Brad294 obj3 = new Brad294();
		obj3.m3(obj2);
	}
}
interface Brad291 {
	void m1();
	void m2();
}
class Brad292 implements Brad291{
	public void m1(){System.out.println("Brad292:m1()");}
	public void m2(){System.out.println("Brad292:m2()");}
}
class Brad293 implements Brad291{
	public void m1(){System.out.println("Brad293:m1()");}
	public void m2(){System.out.println("Brad293:m2()");}
}
class Brad294 {
	void m3(Brad291 b){
		b.m1();
	}
}