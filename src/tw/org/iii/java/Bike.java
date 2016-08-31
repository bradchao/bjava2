package tw.org.iii.java;

public class Bike {
	private double speed;
	private int color;
	int a;
	static int count;
	
	Bike(){
		System.out.println("Bike()");
		color = 2;
		a++;
		count++;
	}
	Bike(int c){
		System.out.println("Bike(int)");
		color = c;
	}
	
	void upSpeed(){
		speed = (speed<1?1:speed*1.2);
	}
	void upSpeed(int gear){
		speed = (speed<1?1:speed*(1.2+gear));
	}
	void downSpeed(){
		speed = (speed<1?0:speed*0.7);
	}
	double getSpeed(){
		return speed;
	}
	static void m1(){
		System.out.println("m1");
	}
	
}
