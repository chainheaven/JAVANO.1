package tw.org.iii.tutor;

public class TEST09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int year = 2400;
//		
//		if (year % 4 !=0)
//			System.out.println("平年");
//		else if (year % 100 !=0)
//			System.out.println("閏年");
//		else if (year % 400 !=0)
//			System.out.println("平年");
//		else if (year % 400 ==0)
//			System.out.println("閏年");

		int year = 2100;
		boolean isLeap;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 潤
					isLeap = true;
				} else {
					// 平
					isLeap = false;
				}
			} else {
				// 潤
				isLeap = true;
			}
		} else {
			// 平
			isLeap = false;
		}

		System.out.printf("%d年為%s年", year, (isLeap ? "閏" : "平"));
	}
}