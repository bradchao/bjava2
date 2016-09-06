package tw.org.iii.java;

public class Brad45 {
	public static void main(String[] args) {
		Brad451 obj1 = new Brad451("A");
		Brad451 obj2 = new Brad451("B");
		Brad452 obj3 = new Brad452("C");
		Thread t1 = new Thread(obj3);
		obj1.start();
		obj2.start();
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		System.out.println("Main");
		obj2.interrupt();
		
		
		
	}
}
class Brad451 extends Thread {
	String name;
	Brad451(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
class Brad452 implements Runnable {
	String name;
	Brad452(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
