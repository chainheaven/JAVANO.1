package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TEST50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			byte[] buf = new byte[4];
			int len;
			while ((len = fin.read(buf)) != -1) {
				System.out.print(new String(buf, 0, len));
			}
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