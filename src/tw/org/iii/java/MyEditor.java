package tw.org.iii.java;

import javax.swing.JFrame;

public class MyEditor extends JFrame{
	public MyEditor(){
		super("My Editor");
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyEditor();
	}

}
