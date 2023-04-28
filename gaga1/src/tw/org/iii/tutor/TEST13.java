package tw.org.iii.tutor;

public class TEST13 {

	public static void main(String[] args) {
		int i = 0;
		for (printTest(); i < 10; printLine()) {
			System.out.println(i++);
		}

	}

	static void printTest() {
		int lottery = (int)(Math.random()*49+1);
		System.out.println("Test");
	}

	static void printLine() {
		System.out.println("----");

	}
}
