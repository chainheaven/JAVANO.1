package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;

public class TEST61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test613 obj = new Test613();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/s1"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("--------");
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/s1"));
			oin.readObject();
			oin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	

}

class Test611 implements Serializable {
	Test611() {
		System.out.println("Test611()");
	}
}

class Test612 extends Test611 {
	Test612() {
		System.out.println("Test612()");
	}
}

class Test613 extends Test612 {
	Test613() {
		System.out.println("Test613()");
	}
}
