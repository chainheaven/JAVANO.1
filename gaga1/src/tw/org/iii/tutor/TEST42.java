
package tw.org.iii.tutor;

public class TEST42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 3;
		int[] c = { 1, 2, 3, 4 };
		try {
			System.out.println(a / b);
			System.out.println(c[4]);
		} catch (ArrayIndexOutOfBoundsException ee) {
			System.out.println("oops");
		} catch (ArithmeticException ae) {
			System.out.println("wewe");
		} catch (RuntimeException re) {
			System.out.println("rrrr");
		}
		System.out.println("ok");
	}
}
