package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyEditor extends JFrame{
	private JButton open,save,exit;
	private JTextArea editor;
	
	public MyEditor(){
		super("My Editor");
		setLayout(new BorderLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);top.add(save);top.add(exit);
		add(top, BorderLayout.NORTH);
		
		editor = new JTextArea();
		add(editor, BorderLayout.CENTER);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	private void doOpen(){
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null)==
				JFileChooser.APPROVE_OPTION){
			File openFile = jfc.getSelectedFile();
			System.out.println(openFile.getAbsolutePath());
		}
	}
	private void doSave(){
		
	}
	
	public static void main(String[] args) {
		new MyEditor();
	}

}
