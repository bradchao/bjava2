package tw.org.iii.java;

public class Poker {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++){
			int temp = (int)(Math.random()*52);
			
			// 檢查機制
			boolean isRepeat = false;
			for (int j=0; j<i; j++){
				if (temp == poker[j]){
					isRepeat = true;
					break;
				}
			}
			if (isRepeat) {
				i--;
				continue;
			}
			
			System.out.println(temp);
			poker[i] = temp;
		}
	}

}
