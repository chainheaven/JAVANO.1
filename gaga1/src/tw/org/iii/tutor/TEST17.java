package tw.org.iii.tutor;

public class TEST17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];

		for (int[] a1 : a) {
			for (int a2 : a1) {
				System.out.println(a2 + "");
			}
			System.out.println();
		}
		System.out.println("-----");
		System.out.println(a);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] + "");
			}
			System.out.println();
		}
	}

}
