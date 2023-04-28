package tw.org.iii.tutor;

public class TWID1 {
	private String id;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";

	public TWID1() {
		this((int) (Math.random() * 2) == 0);
	}

	public TWID1(boolean isMale) {
		this(isMale, (int) (Math.random() * 26));
	}

	public TWID1(int area) {
		this((int) (Math.random() * 2) == 0, area);
	}

	public TWID1(boolean isMale, int area) {
		String c1 = letters.substring(area, area + 1);
		StringBuilder sb = new StringBuilder(c1);
		sb.append(isMale ? "1" : "2");
		for (int i = 0; i < 7; i++) {
			sb.append((int) (Math.random() * 10));
		}

		String temp = sb.toString();
		for (int i = 0; i < 10; i++) {
			if (checkId(temp + i)) {
				id = temp + 1;
				break;
			}
		}

	}

	private TWID1(String id) {
		this.id = id;
	}

	public static TWID1 createTWID1(String id) {
		TWID1 twId = null;
		if (checkId(id)) {
			twId = new TWID1(id);
		}
		return twId;
	}

	public String getId() {
		return id;
	}

	public static boolean checkId(String id) {
		// 1. len = 10
		// 2. c1 => A-Z
		// 3. c2 => 1, 2
		// 4. c3-10 => 0 - 9
		boolean isRight = false;
		if (id.matches("[A-Z][1289][0-9]{8}")) {
			char c1 = id.charAt(0);
			int n12 = letters.indexOf(c1) + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));

			int sum = n1 * 1 + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7 * 4 + n8 * 3 + n9 * 2 + n10 * 1
					+ n11 * 1;
			isRight = sum % 10 == 0;
		}

		return isRight;
	}

}