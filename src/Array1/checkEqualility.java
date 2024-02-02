package Array1;

public class checkEqualility {

	public static void main(String[] args) {
		
		int a[]= {2,5,1,7,4};
		int b[]= {2,5,1,7,5};

		boolean flag=false;
		
		
		for(int i =0; i<a.length ;i++) {	
			if(a[i]!=b[i]) {
					flag=true;
					
					}
		}
		
		if(flag==true) {
			System.out.println("Array are not equal");
			
		}
			
			else {
					System.out.println("Array are equal");
				}
					
				}
				
			}
			
