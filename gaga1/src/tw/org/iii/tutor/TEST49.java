package tw.org.iii.tutor;

import java.io.File;

public class TEST49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir1 = new File("dir1");
		if (dir1.exists() && dir1.isDirectory()) {
			File[] files = dir1.listFiles();
			for (File file : files) {
				String fname = file.getName();
				long size = file.length();
				String type = file.isDirectory() ? "dir" : "file";
				System.out.println(fname + ":" + size + ":" + type);
			}

		}

	}

}
