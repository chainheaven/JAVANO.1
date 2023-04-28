package tw.org.iii.tutor;

import tw.org.iii.tutor.*;

public class TEST23 {

	public static void main(String[] args) {
		String id = "A123456789";
		if (TWID1.checkId(id)) {
			System.out.println("OK");
		} else {
			System.out.println("XX");
		}
		System.out.println("---");

		TWID1 id1 = new TWID1();
		TWID1 id2 = new TWID1(1);
		TWID1 id3 = new TWID1(false);
		TWID1 id4 = new TWID1(true, 0);

		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());

		TWID1 id5 = TWID1.createTWID1("A123456789");
		System.out.println(id5.getId());

	}

}
