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
		open.addActionListener(new MyListener());
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Brad");
			}
		});
		save.addActionListener(this);
		exit.addActionListener(this);
//		save.addActionListener(new MyListener());
//		exit.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Brad28();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == open){
			System.out.println("Open");
		}else if (e.getSource() == save){
			System.out.println("Save");
		}else if (e.getSource() == exit){
			System.out.println("Exit");
		}
	}
}

class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Save");
	}
}

