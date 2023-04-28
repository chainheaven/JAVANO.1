package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TEST57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		File source = new File("dir2/TEST.jpa");
		File target = new File("dir1/kitty.jpg");
		try {
			FileInputStream fin = new FileInputStream(source);
			byte[] buf = new byte[(int) source.length()];
			fin.read(buf);
			fin.close();

			FileOutputStream fout = new FileOutputStream(target);
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("finish3:" + (System.currentTimeMillis() - start));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}