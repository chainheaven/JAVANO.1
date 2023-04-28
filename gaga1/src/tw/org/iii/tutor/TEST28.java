package tw.org.iii.tutor;

public class TEST28 {

	public static void main(String[] args) {
		TEST281 obj1 = new TEST281(2);
		TEST282 obj2 = new TEST282();
		TEST283 obj3 = new TEST283();
		Timer timer = new Timer();
		timer.startTimer();
		// 执行一些代码
		timer.stopTimer();
		System.out.println("Time elapsed: " + timer.getTimeElapsed() + "ms");
	}

}

class TEST281 extends Object {
	TEST281(int a) {
		// super();
		System.out.println("TEST281(int)");
	}
}

class TEST282 extends TEST281 {
	TEST282() {
		super(3);
		System.out.println("TEST282()");
	}
}

class TEST283 extends TEST282 {
	TEST283() {
		System.out.println("TEST283()");
	}
}

class Timer {
	private long startTime;

	public void startTimer() {
		startTime = System.currentTimeMillis();
	}

	public void stopTimer() {
		// do something
	}

	public long getTimeElapsed() {
		return 0; // calculate elapsed time
	}
}