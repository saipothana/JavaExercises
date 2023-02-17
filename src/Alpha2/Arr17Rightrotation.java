package Alpha2;
import java.util.Scanner;
public class Arr17Rightrotation {

	/*
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int i;
	System.out.println("Entre size");
	int n=sc.nextInt();
	int a[]=new int[n+1];
	for(i=0;i<n;i++) {
		System.out.println("Entre arr ele"+i);
		a[i]=sc.nextInt();
	}
	
	System.out.println("Before rotate");
	Arr10Delete.print(a, n);  //im using print function here this func is created by me
	
	
	int p=a[0];
	for(i=0;i<n;i++) {
		a[i]=a[i+1];
	}
	a[n-1]=p;
	
	System.out.println("After rotate");
	Arr10Delete.print(a, n);
	
	
}
}

*/
	
	public static int[] rightrotate(int a[],int n) {
		int p=a[0],i;
		for(i=0;i<n;i++) {
			a[i]=a[i+1];
		}
		a[n-1]=p;
		
		return a;
	}
	
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre size");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("Before rotate");
		Arr10Delete.input(a, n);
		Arr10Delete.print(a, n);
		rightrotate(a,n);
		System.out.println("After rotate");
		Arr10Delete.print(a, n);	
		
	}
}
