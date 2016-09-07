package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

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
		private Timer timer;
		private int ballX, ballY;
		MyGame(){
			timer = new Timer();
			timer.schedule(new ViewTask(), 1000, 70);
		}
		private class ViewTask extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
		private class Ball {
			private int x, y, w, h;
			private Color color;
			private Timer timer;
			Ball(int x, int y, int w, int h, Color color){
				this.x=x;this.y=y;this.w=w;this.h=h;
				this.color = color;
				timer = new Timer();
			}
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			
			g2d.setColor(Color.red);
			g2d.fillOval(ballX, ballY, 30, 30);
		}
	}
	
	public static void main(String[] args) {
		new Brad47();
	}
	
}
