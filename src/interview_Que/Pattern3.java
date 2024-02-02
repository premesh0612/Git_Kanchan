package interview_Que;

public class Pattern3 {

	static int a=1;
	
	public static void main(String[] args) {
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=r;c++){
				System.out.print(a+ " ");
				a++;
			}
			System.out.println();
		}

	}

}
