package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;

public class TEST36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("III");
		set.add("Test");
		set.add("Eric");
		set.add("Peter");
		set.add("Tony");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("---");
		for (String V : set) {
			System.out.println(V);
		}
	}

}
