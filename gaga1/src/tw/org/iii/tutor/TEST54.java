package tw.org.iii.tutor;

import java.io.FileReader;

import javax.annotation.processing.Filer;

public class TEST54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader reader = new FileReader("dir1/file1.txt");
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
			reader.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
