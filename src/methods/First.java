package methods;

public class First {

	int number = 10;  //normal variable

	static int secondNumber =30; // Static variable
	
	public void m1() {
		 System.out.println("Non static method");
	}
	
	public static void m2() {
		System.out.println("Static method");
		
	}  
	
	
	public static void main(String[] args) {
		
		First ref = new First();
		
		System.out.println(ref.number);
		
		System.out.println(secondNumber);
		
		ref.m1();
		m2();
		
		

	}

}
