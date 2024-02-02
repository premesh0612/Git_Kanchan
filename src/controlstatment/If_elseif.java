package controlstatment;

public class If_elseif {

	public static void main(String[] args) {
		
		int a=34;
		
		if (a>75)
		{
			System.out.println("A grade");
			
		}
		
		else if (a<=75 && a>=60) {
			System.out.println("B grade");
		
		}

		else if (a>=35 && a<60) {
			
			System.out.println("C grade");
		}
		else {
			
			System.out.println("D grade");
		}
	}
	

}
