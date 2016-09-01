package tw.org.iii.java;

import javax.swing.JOptionPane;

public class Brad26 {

	public static void main(String[] args) {
		// 1. create Answer
		String answer = createAnswer();
		
		// 2. start game
		for (int i=0; i<3; i++){
			// 3. Guess
			String guess = JOptionPane.showInputDialog("Input");
			
			// 4. Check ?A?B
			JOptionPane.showMessageDialog(null, "1A2B");
		}
		
		// 5. WINNER / ....
	}

	static String createAnswer(){
		return "172";
	}
	
	
}
