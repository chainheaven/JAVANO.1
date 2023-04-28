package tw.org.iii.tutor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

public class TEST53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data = "Hello\n";
			FileOutputStream fout = new FileOutputStream("dir1/file2.txt", true);
			fout.write(data.getBytes());
			fout.close();
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
