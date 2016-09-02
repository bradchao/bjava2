package tw.org.iii.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad28 extends JFrame implements ActionListener{
	private JButton open, save, exit;
	
	public Brad28(){
		super("My Window App");
		
		setLayout(new FlowLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		add(open); add(save); add(exit);
		open.addActionListener(this);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Brad28();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
}
