package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;

public class TEST19 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println(bike.getSpeed());
		bike.upSpeed();
		System.out.println(bike.getSpeed());
		bike.downSpeed();
		System.out.println(bike.getSpeed());
	}

}
