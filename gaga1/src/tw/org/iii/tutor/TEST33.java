package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;

public class TEST33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		int d = Integer.parseInt("10");
		Integer e = 10; // auto-boxing
		System.out.println(e.doubleValue());

		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b + e); // b , c => auto-boxing
		// System.out.println(b1 + b2); 母湯F

	}

}