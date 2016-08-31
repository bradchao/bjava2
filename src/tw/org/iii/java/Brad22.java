package tw.org.iii.java;

public class Brad22 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		System.out.println(myBike.speed);
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		urBike.upSpeed();
		urBike.upSpeed();
		urBike.downSpeed();
		System.out.println(myBike.speed);
		System.out.println(urBike.speed);
	}

}
