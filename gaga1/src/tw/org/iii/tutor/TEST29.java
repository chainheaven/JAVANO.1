package tw.org.iii.tutor;

public class TEST29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TEST292 obj1 = new TEST292();
		TEST291 obj2 = new TEST292();
		TEST291 obj3 = new TEST293();
		doThing(obj3);
	}

	static void doThing(TEST291 obj) {

	}

}

class TEST291 {
	void m1() {
		System.out.println("TEST291:m1()");
	}
}

class TEST292 extends TEST291 {
	void m1() {
		System.out.println("TEST292:m1()");
	}

	void m2() {
		System.out.println("TEST292:m2()");
	}
}

class TEST293 extends TEST291 {
	void m1() {
		System.out.println("TEST293:m1()");
	}

	void m2() {
		System.out.println("TEST293:m2()");
	}
}
