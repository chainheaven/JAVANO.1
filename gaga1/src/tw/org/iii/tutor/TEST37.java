package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.TreeSet;

public class TEST37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashSet<Integer> lottery = new HashSet<>();
		TreeSet<Integer> lottery = new TreeSet<>();
		while (lottery.size() < 6) {
			lottery.add((int) (Math.random() * 49 + 1));
		}
		System.out.println(lottery);
	}

}
