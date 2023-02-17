package Alpha2;
import java.util.Scanner;
public class Arr27subarraymaxkadane {
public static int kadane(int a[],int n) {
	int i,j,k,cs=0,ms=Integer.MIN_VALUE;
	
	for(i=0;i<n;i++) {
		
		if(cs<0) {
			cs=0;
		}
		else {
			cs=cs+a[i];
		}
		System.out.println("the "+cs);
		
		if(cs>ms) {
			ms=cs;
		}
		
		System.out.println("the "+ms);
		
		
	}
	return ms;
	
}


public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	
	Arr8Sorting.input(a, n);
	Arr8Sorting.print(a, n);
	int max=kadane(a,n);
	System.out.println("max = "+max);

}
}
