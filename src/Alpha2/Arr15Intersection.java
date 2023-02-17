package Alpha2;
import java.util.*;
public class Arr15Intersection {
	/*

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n1,n2,i,j=0;
	System.out.println("Enter n1 and n2");
	n1=sc.nextInt();
	n2=sc.nextInt();
	
	
	int a[]=new int[n1];
	int b[]=new int[n2];
	int c[]=new int[n1+n2];
	for(i=0;i<n1;i++) {
		System.out.println("enter arr ele "+i);
	a[i]=sc.nextInt();	
	}
	
	for(i=0;i<n2;i++) {
		System.out.println("enter arr ele "+i);
	b[i]=sc.nextInt();	
	}
	int size=0;
	
	int k=0;
	
	for(i=0;i<n1;i++) {
		for(j=0;j<n2;j++) {
			//System.out.println("hi");
			if(a[i]==b[j]) {
			c[size++]=a[i];
			}
		}
	}
	
	
	for(i=0;i<size;i++) {
		System.out.println(c[i]);
	}
		
				
				
}
}

*/
	static Scanner sc = new Scanner(System.in);

	public static void input(int a[], int n) {
	int i = 0;
	while (i < n) {
	System.out.println("Enter element " + i + ": ");
	a[i] = sc.nextInt();
	i++;
	}
	}

	public static void print(int a[], int n) {
	int i = 0;
	System.out.println("Array elements: ");
	while (i < n) {
	System.out.println(a[i]);
	i++;
	}
	}
	
	public static int[] intersection(int a[],int b[],int c[],int n1,int n2,int n3) {
		
		
	int i,j,size=0;
	for(i=0;i<n1;i++) {
		for(j=0;j<n2;j++) {
			//System.out.println("hi");
			if(a[i]==b[j]) {
			c[size++]=a[i];
			}
		}
	}
		
		int newarr[]=new int[size];
		for(i=0;i<size;i++) {
			newarr[i]=c[i];
		}
		
		return newarr;
		
	
		
	}
	
	public static void main(String[]args) {
		int n1=sc.nextInt();
		
		int i,j=0;
		int a[]=new int[n1];
		input(a,n1);
		print(a,n1);
		int n2=sc.nextInt();
		int b[]=new int[n2];
		input(b,n2);
		print(b,n2);
		int n3=n1+n2;
		int c[]=new int[n3];
		
	int newarr[]=intersection(a,b,c,n1,n2,n3);
	
	
	print(newarr,newarr.length);
		
	}
}
