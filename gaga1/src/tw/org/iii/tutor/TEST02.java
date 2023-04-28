package tw.org.iii.tutor;

import java.util.Scanner;

public class TEST02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// INPUT => 10 + 3 = 13;
		Scanner scanner = new Scanner(System.in);
		System.out.println("x = ");
		int x = scanner.nextInt();
		System.out.println("y = ");
		int y = scanner.nextInt();
		int r = x + y ;
		int r1 = x - y ;
		int r2 = x * y;
		int r3 = x / y;
		int mod = x % y;
//		System.out.println(x + " + " + y + " = " + r);
		System.out.printf("%d + %d = %d\n", x, y, r);
		System.out.printf("%d + %d = %d\n", x, y, r1);
		System.out.printf("%d + %d = %d\n", x, y, r2);
		System.out.printf("%d + %d = %d", x, y, r3, mod);
		System.out.printf("%d + %d = %d...%d", x, y, r3, mod);
	}

}
