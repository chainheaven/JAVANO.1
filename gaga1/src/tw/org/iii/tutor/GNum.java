package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GNum extends JFrame implements ActionListener {
	private JButton guess;
	private JButton guess2;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private long startTime; // 遊戲開始時間
	private int counter;

	public GNum() {
		super("猜數字遊戲");

		guess = new JButton("猜");
		guess2 = new JButton("傻");
		input = new JTextField();
		log = new JTextArea();
		startTime = System.currentTimeMillis(); // 紀錄遊戲開始時間

		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);

		add(top, BorderLayout.NORTH);

		add(log, BorderLayout.CENTER);

		JPanel down = new JPanel(new BorderLayout());

		down.add(guess2, BorderLayout.SOUTH);

		add(down, BorderLayout.EAST);

		guess.addActionListener(this);
		guess2.addActionListener(this);

		initView();
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		newGame();

	}

	public static void main(String[] args) {
		new GNum();

	}

	private void initView() {
		input.setFont(new Font(null, Font.BOLD, 24));
		log.setFont(new Font(null, Font.BOLD | Font.ITALIC, 20));
	}

	private void newGame() {
		answer = createAnswer(4);
		log.setText("");
		input.setText("");
		counter = 0;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		String strInput = input.getText();
//		String result = cheackAB(strInput);
//		log.append(strInput + " => " + result + "\n");
//		input.setText("");
		if (e.getSource() == guess) {
			String strInput = input.getText();
			counter++;
			String result = cheackAB(strInput);
//			log.append(strInput + " => " + result + "\n");
			log.append(String.format("%d.%s => %s \n", counter, strInput, result));
			input.setText("");

			if (result.equals("4A0B")) {
				// 計算總共花費的時間並顯示
				long endTime = System.currentTimeMillis();
				long timeUsed = (endTime - startTime) / 1000; // 轉換為秒
				log.append(String.format("恭喜答對！共花費 %d 秒", timeUsed));
				newGame();
			} else if (counter == 10) {
				JOptionPane.showMessageDialog(null, "煞筆:答案是 = " + answer);
				newGame();
			}
		} else if (e.getSource() == guess2) {
			log.append("答案是 " + answer + "\n");
		}
	}

	private boolean isValid(String g) {

		return true;
	}

	private String cheackAB(String g) {
		int A, B;
		A = B = 0;
		for (int i = 0; i < g.length(); i++) {
			char c = g.charAt(i);
			if (// c 是否存在於 answer的 i 位置中
			c == answer.charAt(i)) {
				A++;
			} else if (// c 是否存在於 answer
			answer.indexOf(c) != -1) {
				B++;
			}
		}

		return String.format("%dA%dB", A, B);
	}

	private String createAnswer(int n) {
		int num = 10;
		int[] poker = new int[num];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;

		for (int i = num - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append(poker[i]);
		}
		return sb.toString();
	}

}

class oolistener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}

}