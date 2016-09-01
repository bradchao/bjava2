package tw.org.iii.java;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad28 extends JFrame {
	private JButton open, save, exit;
	
	public Brad28(){
		super("My Window App");
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		setSize(640, 480);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Brad28();
	}

}
