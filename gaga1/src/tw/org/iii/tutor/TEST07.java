package tw.org.iii.tutor;

public class TEST07 {

	public static void main(String[] args) {
//		int score = 47;
//		if(score > 60) {
//			System.out.println("Pass");
//		}else {System.out.println("Down");

//		double temp = Math.random();
//		System.out.println(temp);
//		int score = (int)(temp * 101);
//		System.out.println(score);
//		int score = (int)temp;
//		System.out.println(score);

		int score = (int) (Math.random() * 101);
		System.out.println(score);
		if (score >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Down");
		}

	}

}
