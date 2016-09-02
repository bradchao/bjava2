package tw.org.iii.java;
public class Brad30 {
	public static void main(String[] args) {
		Brad301 obj1 = new Brad301();
		//Brad302 obj2 = new Brad302();
		Brad302 obj3 = new Brad303();
	}
}
class Brad301 {
	void m1(){}
	void m2(){}
}
abstract class Brad302 {
	Brad302(){
		System.out.println("Brad302()");
	}
	void m1(){}
	abstract void m2();
}
class Brad303 extends Brad302 {
	void m2(){System.out.println("Brad303:m2()");}
}
class Brad304 extends Brad302 {
	void m2(){System.out.println("Brad304:m2()");}
}


