package controlstatment;

public class Swapping {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		int c;
		
		
		System.out.println("The value of a is " + a);
		System.out.println("The value of a is " + b);
		
		System.out.println("============================");
		
		c=a+b;
		a=c-a;
		b=c-b;
	
		System.out.println("The value of a is " + a);
		System.out.println("The value of a is " + b);
	}

}
