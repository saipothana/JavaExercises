//copy of array

package Alpha2;
import java.util.Scanner;
public class Arr2copyarray {

	/*
	
	
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
int a[]=new int[n];

int b[]=new int[a.length];

for(int i=0;i<a.length;i++) {
	System.out.println("ENtre ele"+i);
	a[i]=sc.nextInt();
}
	//before copy

for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);	
	}
	
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
	
	//after copy
	
	for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);	
	}
}
	
}


*/
	
	static Scanner sc=new Scanner(System.in);
	public static void input(int a[],int n) {
		int i;
		for(i=0;i<n;i++) {
			System.out.println("ENtre ele"+i);
			a[i]=sc.nextInt();
		}
	}
	
	
	public static void print(int a[],int n) {
		int i;
		for(i=0;i<n;i++) {
		System.out.println("the ele"+i+"is"+a[i]);	
		}
	}
	
	public static void beforecopy(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);	
			}
	}
	
	public static void aftercopy(int b[],int n) {
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);	
			}
	}
	
	
	public static void main(String[]args) {
		
	
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[a.length];
		int i;
		input(a,n);
		print(a,n);
		beforecopy(a,n);
		for(i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		aftercopy(b,n);
	}
}
	
	
	
