package tw.org.iii.java;

import javax.swing.JOptionPane;

public class Brad26 {

	public static void main(String[] args) {
		// 1. create Answer
		String answer = createAnswer(4);
		//System.out.println(answer);
		
		// 2. start game
		boolean isWINNER = false;
		for (int i=0; i<10; i++){
			// 3. Guess
			String guess = JOptionPane.showInputDialog("Input");
			
			// 4. Check ?A?B
			if (guess.equals(answer)){
				isWINNER = true;
				break;
			}
			String result = checkAB(answer, guess);
			JOptionPane.showMessageDialog(null, 
					guess + ":" + result);
		}
		
		// 5. WINNER / ....
		if (isWINNER){
			JOptionPane.showMessageDialog(null, 
					"恭喜老爺");
		}else{
			JOptionPane.showMessageDialog(null, 
					"魯蛇一條：" + answer);
		}
		
		
		
	}

	static String createAnswer(int n){
		// 洗牌
		int[] poker = new int[n];
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
		String ret = "";
		for (int p : poker)ret += p;
		
		return ret;
	}
	static String checkAB(String a, String g){
		int A, B; A = B = 0;
		for (int i=0; i<g.length(); i++){
			if (g.charAt(i) == a.charAt(i)){
				A++;
			}else if (a.indexOf(g.charAt(i))!=-1){
				B++;
			}
		}
		return A + "A" + B + "B";
	}
	
}
