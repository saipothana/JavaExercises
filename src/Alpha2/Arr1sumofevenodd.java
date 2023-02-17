//sum of even oddd with or without methods

package Alpha2;
import java.util.Scanner;
public class Arr1sumofevenodd {

	/*
	 
	public static void main(String[]arr) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		
		//taking input
	for(i=0;i<a.length;i++) {
	System.out.println("entre array element"+i);
	 a[i]=sc.nextInt();
	}
	
	
	//displaying sum
	
	int es=0,os=0;
	
	for(i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			es=es+a[i];
		}
		else {
			os=os+a[i];
		}
	}
	
	System.out.println("os="+os+"es = "+es);
	}


}


*/
	
// *****method*******
	//input method
	static Scanner sc=new Scanner(System.in);
	public static void input(int a[],int n) {
		int i=0;
		while(i<n) {
			System.out.println("entre array element"+i);
			 a[i]=sc.nextInt();
			 i++;
		}
	}
	
	//print method
	
	public static void print(int a[],int n) {
		int i;
		for(i=0;i<n;i++) {
		System.out.println("the ele"+i+"is"+a[i]);	
		}
	}
	
	//evensum
	
	public static int even(int a[],int n) {
		int i,es=0;
		for(i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				es=es+a[i];
			}
	}
		
		return es;
	}
	
	
	//odd sum
	public static int odd(int a[],int n) {
		int i,os=0;
		for(i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				os=os+a[i];
			}
	}
		
		return os;
	}
	
	
	public static void main(String[]args) {
		int n;
		System.out.println("Enter size of aarray");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		input(a,n);
		print(a,n);
	System.out.println("even="+	even(a,n));
	
	System.out.println("odd="+	odd(a,n));
	}
	
}
	
