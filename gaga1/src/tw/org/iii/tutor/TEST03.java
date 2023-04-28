package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class TEST03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strX = JOptionPane.showInputDialog("X = ?");
		String strY = JOptionPane.showInputDialog("X = ?");
		
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		
		int r = x + y ;
		JOptionPane.showMessageDialog(null, 
				String.format("%d + %d = %d", x, y, r));
	}

}
