package tw.org.iii.tutor;

public class TEST34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Test341 {
	void m1();
}

interface Test342 {
	void m2();
}

interface Test343 extends Test341 {
	void m3();

}

class Test344 implements Test343 {
	public void m1() {
	}

	public void m3() {
	}
}