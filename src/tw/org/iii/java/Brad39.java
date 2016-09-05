package tw.org.iii.java;

public class Brad39 {
	public static void main(String[] args) {

	}
}
class Student {
	int ch, eng, math;
	Student(int ch, int eng, int math){
		this.ch = ch; this.eng = eng; this.math=math;
	}
	int getScore(){return ch+eng+math;}
	double getAvg(){return getScore()/3.0;}
}
