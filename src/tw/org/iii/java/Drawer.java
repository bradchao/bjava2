package tw.org.iii.java;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Drawer extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.red);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(0, 0, 100, 100);
		
	}
}
