package tw.org.iii.tutor;

import java.util.HashSet;

import tw.org.iii.classes.Bike;

public class TEST35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("Test");
		set.add(new Bike());
		set.add(123);
		set.add("Test");
		set.add(123);
		System.out.println((set.size()));
		System.out.println((set.toString()));
	}

}
