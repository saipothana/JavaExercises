package Alpha2;
import java.util.Scanner;
public class Arr6Linearsearch {

	
	/*  
	 
	public static void main(String[]args) { 
	Scanner sc=new Scanner(System.in);
	
	int i,sr,n,flag=0;
	System.out.println("enter size");
	 n=sc.nextInt();
	 System.out.println("Enter element to search");
	 sr=sc.nextInt();
	 
	 int a[]=new int[n];
	 for(i=0;i<a.length;i++) {
		 System.out.println("Entre ele"+i);
			a[i]=sc.nextInt();
 
	 }
	 
	 for(i=0;i<a.length;i++) {
		 if(a[i]==sr) {
			 flag=1;
			 break;
		 }
	 }
	 
	 
	 if(flag==1) {
		 System.out.println(sr+"is fount in position"+i);
	 }
	 else {
		 System.out.println("Ele not found");
	 }
}
}

	
	*/
	
	
	
	/******Method****************/
	
	static Scanner sc=new Scanner(System.in);
	
	public static void input(int a[],int n) {
		
		int i=0;
			while(i<n) {
				System.out.println("Entre ele"+i);
				a[i]=sc.nextInt();
				i++;
			}
		}
	
	
	public static void output(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static int search(int a[],int n,int sr ) {
		int i;
		 for(i=0;i<a.length;i++) {
			 if(a[i]==sr) {
				
				 break;
			 }
		 }
		 if(i<n) {
			 return i;
		 }
		 return -1;
		 
	}
	
	
	public static void main(String[]args) {
		
	int n,sr;
	
		System.out.println("enter size");
		 n=sc.nextInt();
		 
		 int a[]=new int[n];
		 System.out.println("Enter element to search");
		 sr=sc.nextInt();
		 input(a,n);
		 output(a,n);
		int res=search(a,n,sr);
		if(res>=0) {
			System.out.println(sr+" is found in position"+res);
		}
		else {
			 System.out.println(sr+"Ele not found");
		 }
		
	}
	}
