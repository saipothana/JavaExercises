package Alpha2;
import java.util.Scanner;
public class Arr28traprainwater {
public static int trap(int a[],int n) {
	int left[]=new int[n],i,j,k=0;
	int right[]=new int[n];
	left[0]=Integer.MIN_VALUE;
	int max=0;
	for(i=0;i<n;i++) {
		if(a[i]>max) {
			max=a[i];
			
			left[i]=max;
		}
		else {
			
			left[i]=max;
		}
		
	}
	right[n-1]=Integer.MIN_VALUE;
	max=0;
	for(i=n-1;i>=0;i--) {
		if(a[i]>max) {
			max=a[i];
			right[i]=max;
		}
		else {
			right[i]=max;
		}
	}
	//left max
	for(i=0;i<n;i++) {
		System.out.print(left[i]+" ");
	}
	System.out.println("right");
	//right max
	for(i=0;i<n;i++) {
		System.out.print(right[i]+" ");
	}
	
	int sum=0;
	for(i=0;i<left.length;i++) {
		
	
		sum=sum+(a[i]-(Math.min(left[i],right[i])));
	
	}
	
	return sum;
	
}


public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	Arr8Sorting.input(a, n);
	
	System.out.println("the total trap"+trap(a,n));
}
}
