package Alpha2;
import java.util.Scanner;
public class Arr20leftmultiple {
	/*
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n,i,j,size,k,p;
	System.out.print("Enter no.of rotations: ");
	 n=sc.nextInt();
	System.out.println("Enter the size of array");
	size=sc.nextInt();
	 int a[]=new int[size+1];
	
	 System.out.println("Before rotate");
		Arr10Delete.input(a, n);
		Arr10Delete.print(a, n);
		
		for(i=0;i<n;i++) {
			 System.out.println(i+"th rotation");
			p=a[size-1];
			for(j=size-1;j>=0;j--) {
				a[j+1]=a[j];
			}
			a[0]=p;
			
			Arr10Delete.print(a, size);
					
		}
}
	
	
}

*/
	
	
	public static void leftmultiple(int a[],int size,int n) {
		
		int i,j,k,p;
			 
		for(i=0;i<n;i++) {
			 System.out.println(i+"th rotation");
			p=a[size-1];
			for(j=size-1;j>=0;j--) {
				a[j+1]=a[j];
			}
			a[0]=p;
			
			Arr10Delete.print(a, size);
					
		}
		
}	 
				
				 
				
				 
			 
		
		
		
	public static void main(String[]args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter no.of rotations: ");
			int  size=sc.nextInt();
			System.out.println("Entre size");
			int n=sc.nextInt();
			int a[]=new int[n+1];
			System.out.println("Before rotate");
			Arr10Delete.input(a, n);
			Arr10Delete.print(a, n);
			
		leftmultiple(a,n,size);
			
	}
	}

