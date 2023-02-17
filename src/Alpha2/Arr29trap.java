package Alpha2;
import java.util.Scanner;
public class Arr29trap {

	
	public static int trap(int a[],int n) {
		int left[]=new int[n],i,j,k=0;
		int right[]=new int[n];
		left[0]=a[0];
		
		for(i=1;i<n;i++) {
		left[i]=Math.max(a[i],left[i-1]);
			
		}
		
		right[n-1]=a[n-1];
		for(j=n-2;j>=0;j--) {
		right[j]=Math.max(a[j],right[j+1]);	
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


