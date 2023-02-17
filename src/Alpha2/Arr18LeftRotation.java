package Alpha2;
import java.util.Scanner;
public class Arr18LeftRotation {
	/*
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int i;
	System.out.println("Entre size");
	int n=sc.nextInt();
	int a[]=new int[n+1];
	
	System.out.println("Before rotate");
	Arr10Delete.input(a, n);
	Arr10Delete.print(a, n);
	int p=a[n-1];
	
	for(i=n-1;i>=0;i--) {
		a[i+1]=a[i];
	}
	a[0]=p;
	
	
	System.out.println("After rotate");
	Arr10Delete.print(a, n);	
}
	
}

*/
	
	public static int[] Leftrotate(int a[],int n) {
		int p=a[n-1],i;
		
		for(i=n-1;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=p;
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
		Leftrotate(a,n);
		System.out.println("After rotate");
		Arr10Delete.print(a, n);	
		
}
}
