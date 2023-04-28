package tw.org.iii.tutor;

import java.net.InetAddress;

public class TEST62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.google.com");

			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
//			System.out.println(ip.getHostAddress());
//			System.out.println(ip.getHostName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
