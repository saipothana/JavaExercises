package Alpha2;
import java.util.Scanner;
public class Sort1Bubblesortoptimization {
 	
	public static int[] bubble(int a[],int n) {
		int i,j,temp=0;
		int swaps=0,count=0;
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-1-i;swaps=0, j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					swaps++;
				}
				
			}
			count++;
			
			//if ther is no sort required thenn use this
			/*
			 if(swaps==0)
			  { 
			  System.out.println("no swap done");
			   break;
			    }
			    */
			 
			
			
		}
		
		System.out.println("count"+count);
		return a;
		
		
	}
	
	
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
	int a[]=new int[n];
	
	
	Arr8Sorting.input(a, n);
	System.out.println("before sort");
	
	
	Arr8Sorting.print(a, n);
	
	int newarr[]=bubble(a,n);
	
	System.out.println("After sort");
	
	Arr8Sorting.print(newarr,newarr.length);
	
	}
}
