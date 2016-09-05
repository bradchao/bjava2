package tw.org.iii.java;

import javax.swing.JFrame;

public class MyPainter extends JFrame{
	public MyPainter(){
		super("My Painter");
		
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyPainter();
	}

}
