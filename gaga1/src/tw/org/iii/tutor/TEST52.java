package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TEST52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File sourse = new File("dir1/file1.txt");
			FileInputStream fin = new FileInputStream(sourse);

			byte[] buf = new byte[(int) sourse.length()];
			fin.read(buf);

			System.out.print(new String(buf));

			fin.close();
//			System.out.println((char) c);
//			c = fin.read();
//			System.out.println((char) c);
//			fin.close();
//			System.out.println("OK");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}