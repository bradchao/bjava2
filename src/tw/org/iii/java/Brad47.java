package tw.org.iii.java;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad47 extends JFrame{
	private MyGame gameview;
	
	public Brad47(){
		setLayout(new BorderLayout());
		gameview = new MyGame();
		add(gameview, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyGame extends JPanel {
		
	}
	
	public static void main(String[] args) {
		new Brad47();
	}
	
}
