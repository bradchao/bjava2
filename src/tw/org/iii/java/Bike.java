package tw.org.iii.java;

public class Bike {
	double speed;
	
	void upSpeed(){
		speed = (speed<1?1:speed*1.2);
	}
	void downSpeed(){
		speed = (speed<1?0:speed*0.7);
	}
}
