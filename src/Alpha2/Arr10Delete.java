package Alpha2;
import java.util.Scanner;
public class Arr10Delete 
{
	
	/*
public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
       int i;
       int n = sc.nextInt();
       int a[] = new int[n+1];
       for (i = 0; i < n; i++) {
           System.out.println("Enter ele" + i);
           a[i] = sc.nextInt();
       }

       int in;
       System.out.println("enter index");
       in=sc.nextInt();
       
       for(i=in;i<n;i++) {
    	   a[i]=a[i+1];
       }
       
       
       for(i=0;i<n-1;i++) {
    	   System.out.println(a[i]);
       }
}
}

*/
	
	
	
	static Scanner sc=new Scanner(System.in);

	public static void input(int a[],int n) {
		int i=0;
		while(i<n) {
			System.out.println("ENtre ele"+i);
			a[i]=sc.nextInt();
			i++;
		}
	}

	public static void print(int a[],int n) {
		int i=0;
		while(i<n) {
			System.out.println(a[i]);
			i++;
		}
	}
	
	public static int[] delete(int a[],int n,int in) {
		int i;
		 for(i=in;i<n-1;i++) {
	    	   a[i]=a[i+1];
	       }
		
		return a;
	}
	
	
	public static void main(String[]args) {
		int n=sc.nextInt();
			//int a[]=new int[n];
			int a[]=new int[n];
		    System.out.println("enter index and element to be inserted");
	       int  in = sc.nextInt();
	    
			
	     input(a,n);
	 	print(a,n);
	 	
	 	int newarr[]=delete(a,n,in);
	 	
	 	print(newarr,n-1);
	 	
	}
}


