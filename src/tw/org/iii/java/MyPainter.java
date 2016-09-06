package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPainter extends JFrame{
	private Drawer drawer;
	private JButton clear;
	
	public MyPainter(){
		super("My Painter");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);
		add(top, BorderLayout.NORTH);
		
		drawer = new Drawer();
		add(drawer, BorderLayout.CENTER);
		
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyPainter();
	}

}
