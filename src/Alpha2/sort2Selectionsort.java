package Alpha2;
import java.util.*;
public class sort2Selectionsort {

	
	public static void select(int a[],int n) {
		int min;
		int k[]=new int[n];
		int i,j,count=0,z=0;
		for(i=0;i<n-1;i++) {
			min=i;
			
			for(j=i+1;j<n;j++) {
			if(a[min]>a[j]) {	
				min=j;
			}
			}
			
			a[min]=a[min]+a[i];
			a[i]=a[min]-a[i];
			a[min]=a[min]-a[i];
			}
	
	for(i=0;i<n;i++) {
		System.out.println(a[i]);
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
	
	select(a,n);
	
	}
}

