package Alpha2;
import java.util.Scanner;
public class Arr12Maxmin {
	/*
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		 int i,j,k;
	     int n = sc.nextInt();
	     int a[] = new int[n+1];
	     for (i = 0; i < n; i++) {
	         System.out.println("Enter ele" + i);
	         a[i] = sc.nextInt();
	     }
	     
	     int max=a[0];
	     int min=a[0];
	     for(i=0;i<n;i++) {
	    	 if(a[i]>max) {
	    		 max=a[i];
	    	 }
	    	 
	    	 if(a[i]<min) {
	    		 min=a[i];
	    	 }
	     }
	     
	     System.out.println("max"+max+"min "+min);
	}

}

*/
	
	
	

	static Scanner sc = new Scanner(System.in);

	public static void input(int a[], int n) {
	int i = 0;
	while (i < n) {
	System.out.println("Enter element " + i + ": ");
	a[i] = sc.nextInt();
	i++;
	}
	}

	public static void print(int a[], int n) {
	int i = 0;
	System.out.println("Array elements: ");
	while (i < n) {
	System.out.println(a[i]);
	i++;
	}
	}
	public static int max(int a[],int n) {
		int high=a[0],i;
		for(i=0;i<n;i++) {
	    	 if(a[i]>high) {
	    		 high=a[i];
	    	 }
		}
	    	 return high;
	    	 
	}
		
		public static int min(int a[],int n) {
			int low=a[0],i;
			for(i=0;i<n;i++) {
		    	 if(a[i]<low) {
		    		 low=a[i];
		    	 }
			}
		    	 return low;
		    	 
		}
		
		
		public static void main(String[]args) {
			System.out.println("Enter the number of elements: ");
			int n = sc.nextInt();
			int a[] = new int[n];
			input(a, n);
			print(a, n);
			
			System.out.println("max "+max(a,n));
			
			System.out.println("min "+min(a,n));
		}
		
		
}
