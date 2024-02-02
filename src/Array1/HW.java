package Array1;

public class HW {

	public static void main(String[] args) {

		int a[]= {10,20,30,50};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
				
		}
		System.out.println(sum);
	
		System.out.println("----------------------");
		
		
		int c=0;
		
		for(int b=10; b<=50;b+=10) {
			c=c+b;
		}

		System.out.println(c);
		
		System.out.println("----------------------");
		
		System.out.println(c-sum);

	}

}
