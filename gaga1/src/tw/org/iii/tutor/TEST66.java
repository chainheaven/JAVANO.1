package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TEST66 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("10.0.104.139"), 9957);
			OutputStream oout = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(oout);
			BufferedWriter bw = new BufferedWriter(ow);
			bw.write("螢火蟲");
			bw.flush();
			bw.close();

			socket.close();
			System.out.println("Send OK");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
