package Array1;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,5};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
				
		}
		System.out.println(sum);
	
		System.out.println("----------------------");
		
		
		int c=0;
		
		for(int b=1; b<=5;b++) {
			c=c+b;
		}

		System.out.println(c);
		
		System.out.println("----------------------");
		
		System.out.println(c-sum);
		
	}
	
}







