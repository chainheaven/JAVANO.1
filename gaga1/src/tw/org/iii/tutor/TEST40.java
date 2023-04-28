package tw.org.iii.tutor;

import java.util.HashMap;
import java.util.Set;

public class TEST40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "Test");
		map.put("gender", true);
		map.put("age", 18);
		System.out.println(map.get("age"));

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}
	}

}
