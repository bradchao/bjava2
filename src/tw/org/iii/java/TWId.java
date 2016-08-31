package tw.org.iii.java;

public class TWId {
	private String id;
	
	public TWId(String id){
		this.id = id;
	}
	
	int getArea(){
		return 1;
	}
	// true: female; false: male
	boolean getGender(){
		return id.charAt(1)==2;
	}
	boolean isRight(){
		boolean ret = false;
		if (id.matches("^[A-Z][12][0-9]{8}$")){
			// 驗證碼的比對
			String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int pos = check.indexOf(id.charAt(0));
			int n12 = pos + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(id.substring(1,2));
			int n4 = Integer.parseInt(id.substring(2,3));
			int n5 = Integer.parseInt(id.substring(3,4));
			int n6 = Integer.parseInt(id.substring(4,5));
			int n7 = Integer.parseInt(id.substring(5,6));
			int n8 = Integer.parseInt(id.substring(6,7));
			int n9 = Integer.parseInt(id.substring(7,8));
			int n10 = Integer.parseInt(id.substring(8,9));
			int n11 = Integer.parseInt(id.substring(9,10));
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 +
					n7*4 + n8*3 + n9*2 +n10*1 + n11*1;
			ret = sum % 10 == 0;
		}
		
		return ret;
	}
}
