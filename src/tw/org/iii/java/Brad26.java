package tw.org.iii.java;

import javax.swing.JOptionPane;

public class Brad26 {

	public static void main(String[] args) {
		// 1. create Answer
		String answer = createAnswer();
		System.out.println(answer);
		
		// 2. start game
//		for (int i=0; i<3; i++){
//			// 3. Guess
//			String guess = JOptionPane.showInputDialog("Input");
//			
//			// 4. Check ?A?B
//			String result = checkAB(answer, guess);
//			JOptionPane.showMessageDialog(null, 
//					guess + ":" + result);
//		}
		
		// 5. WINNER / ....
	}

	static String createAnswer(){
		// 洗牌
		int[] poker = new int[4];
		for (int i=0; i<poker.length; i++){
			int temp;
			// 檢查機制
			boolean isRepeat;
			do {
				temp = (int)(Math.random()*10);
				isRepeat = false;
				for (int j=0; j<i; j++){
					if (temp == poker[j]){
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat);
			poker[i] = temp;
		}
		// poker[0], [1], [2]
		
		
		return "" + poker[0] + poker[1] + poker[2] + poker[3];
	}
	static String checkAB(String a, String g){
		return "1A1B";
	}
	
}
