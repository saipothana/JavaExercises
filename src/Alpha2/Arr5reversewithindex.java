package Alpha2;
import java.util.Scanner;
public class Arr5reversewithindex {
	
	/*

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	
int i,j=0;
for(i=0;i<n;i++) {
	System.out.println("Entre ele"+i);
	a[i]=sc.nextInt();
}

System.out.println("Before rev");
for(i=0;i<n;i++) {
	System.out.println(a[i]);
}
System.out.println("After rev");
for(i=n-1;i>=0;i--) {
	System.out.println("a"+"["+(j++) +"]"+"="+a[i]);
}
}
}

*/
	
	
	/****methods*/
	
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
	
	public static void rev(int a[],int n) {
		int i;
		while(--n>=0) {
			System.out.println(a[n]);
			
		}
	}
	
	public static void main(String[]args) {
		int n=sc.nextInt();
		int a[]=new int[n];	
		
		input(a,n);
		output(a,n);
		rev(a,n);
	}
	}
