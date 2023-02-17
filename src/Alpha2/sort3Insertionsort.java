package Alpha2;
import java.util.*;
public class sort3Insertionsort {

	public static void insert(int a[],int n) {
		int i,j,k,temp;
		
		for(i=0;i<n;i++) {
		int curr=a[i];
		int prev=i-1;
		
		while(prev>=0&&a[prev]>curr) {
			a[prev+1]=a[prev];
			prev--;
		}
		
		
		a[prev+1]=curr;
			
			
			
		}
		
	
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
	int a[]=new int[n];
	
	
	Arr8Sorting.input(a, n);
	System.out.println("before sort");
	
	
	Arr8Sorting.print(a, n);
	
	System.out.println("after sort");
	
	insert(a,n);
	Arr8Sorting.print(a, n);
	}
}

