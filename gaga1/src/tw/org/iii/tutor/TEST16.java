package tw.org.iii.tutor;

public class TEST16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = new int[7];
		for (int i = 0; i < 1000000; i++) {
			int point = (int) (Math.random() * 9 + 1);
			if (point >= 1 && point <= 9) {
				p[point >= 7 ? point - 3 : point]++;

			} else {
				p[0]++;
			}
		}
		if (p[0] == 0) {
			for (int i = 1; i <= 6; i++)
				System.out.printf("%d點出現%d次\n", i, p[i]);
		} else {
			System.out.printf("debug = %d", p[0]);
		}
		System.out.println("----");
		for (int v : p) {
			System.out.println(v);
		}
	}

}
