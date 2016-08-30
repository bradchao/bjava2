package tw.org.iii.java;

import javax.swing.JFrame;

public class MyWinApp extends JFrame{
	public MyWinApp(){
		super("My App");
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyWinApp();
	}

}
