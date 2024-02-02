package Access_specifier;

public class ClassA {

	
   int number=9;
	
   void m1(){
		System.out.println("I am Ptl");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassA ref=new ClassA();
		System.out.println(ref.number);
		ref.m1();

	}

}
