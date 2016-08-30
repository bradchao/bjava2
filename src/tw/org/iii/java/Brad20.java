package tw.org.iii.java;

public class Brad20 {

	public static void main(String[] args) {
		int[][] a;
		int[] b[];
		int c[][];
		a = new int[3][4];
		b = new int[3][];
		//c = new int[][4];
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];
		
		b[0][1] = 1;
		b[1][2] = 2;
		b[2][3] = 3;
		
		for (int[] v:b){
			for (int vv:v){
				System.out.print(vv + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("---");
		int[] d = new int[3];
		for (int v:d){
			System.out.println(v);
		}
		System.out.println("---");
		int[] e = new int[]{1,2,3,4,5};
		int[] f = {1,2,3,4,5};
		System.out.println(f.length);
		System.out.println(f[2]);
		int[] g;
		g = new int[]{1,2,3,4,5};
		
		
		
		
		
		
		
	}

}
