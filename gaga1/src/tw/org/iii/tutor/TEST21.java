package tw.org.iii.tutor;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class TEST21 extends JFrame {

	private JButton b1;

	public TEST21() {
		System.out.println("TEST21()");
		setTitle("我的視窗");
		setLayout(new FlowLayout());
		b1 = new JButton("按我");
		add(b1);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TEST21();

	}

}
