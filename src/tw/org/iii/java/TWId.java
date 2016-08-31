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
			ret = true;
		}
		
		return ret;
	}
}
