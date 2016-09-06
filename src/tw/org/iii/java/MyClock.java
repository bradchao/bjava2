package tw.org.iii.java;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	private Timer timer;
	public MyClock(){
		timer = new Timer();
		timer.schedule(new MyTask(), 0, 500);
	}

	private class MyTask extends TimerTask {
		@Override
		public void run() {
			
		}
	}
}
