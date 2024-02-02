package controlstatment;

public class Fact {

	public static void main(String[] args) {
	
		int i=5;
		int factorial=1;
		
		for(i=5;i>=1;i--){
			
			factorial=factorial*i;  //1*5=5, 5*4=20,
			
		}
		System.out.println(factorial);
	}

}
