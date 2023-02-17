package Alpha2;
import java.util.Scanner;

public class Arr9Inserting {
	
	/*
	  
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for (i = 0; i < n; i++) {
            System.out.println("Enter ele" + i);
            a[i] = sc.nextInt();
        }

        int in, value;
        System.out.println("enter index and element to be inserted");
        in = sc.nextInt();
        value = sc.nextInt();
        for (i = n - 1; i > in; i--) {
            a[i + 1] = a[i];
        }
        a[in] = value;

        for (i = 0; i < n + 1; i++) {
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
	/*
	public static int[] insert(int a[],int n,int in,int value) {
		int i;
	int[] newarr=new int[n+1];
	
	for (i = 0; i < n; i++) {
		newarr[i] = a[i];
	}
		 for (i = n - 1; i > in; i--) {
	            newarr[i + 1] = newarr[i];
	        }
	        newarr[in] = value;
	        
	        
	        return newarr;
	}
	*/
	
	
	public static int[] insert(int a[],int n,int in,int value) {
		int i;
		
	 for (i = n - 1; i > in; i--) {
	            a[i + 1] = a[i];
	        }
	        a[in] = value;
	        
	        
	        return a;
	}
	
	
	public static void main(String[]args) {
		int n=sc.nextInt();
			//int a[]=new int[n];
			int a[]=new int[n+1];
		    System.out.println("enter index and element to be inserted");
	       int  in = sc.nextInt();
	     int    value = sc.nextInt();
			
	     input(a,n);
	 	print(a,n);
	 	int newarr[]=insert(a,n,in,value);
	 	
	 	print(newarr,n);
	 
	}
}
	 	