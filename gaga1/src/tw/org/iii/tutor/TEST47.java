package tw.org.iii.tutor;

import java.io.File;

public class TEST47 {

	public static void main(String[] args) {
		File root = new File(".");
		System.out.println(root.getAbsolutePath());
		File dir1 = new File("./dir1");
		if (dir1.exists()) {
			System.out.println("OK");
		} else {
			System.out.println("NONO");
		}
	}

}
