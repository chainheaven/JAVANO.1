package tw.org.iii.tutor;

public class TEST41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0;
		int[] c = { 1, 2, 3, 4 };
		try {
			System.out.println(a / b);
			System.out.println(c[4]);
		} catch (ArithmeticException ee) {
			System.out.println("oops");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Not much");

			System.out.println("55555");
		}
	}
}
