package methods;

public class Second {

	public static void main(String[] args) {
		
		
		First ref2 = new First();
		
		System.out.println(ref2.number);
		
		ref2.m1();
		
		System.out.println(First.secondNumber);
		 
		
		First.m2();

	}

}
