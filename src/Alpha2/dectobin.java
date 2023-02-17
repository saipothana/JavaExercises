
package Alpha2;
import java.util.Scanner;
public class dectobin {
/*
	public static void dectobin(int num) {
		int r,size=0;
		int a[]=new int[32];
		while(num>0) {
			 a[size++]=num%2;
			num/=2;
		}
	
	
	
	int i;
	//System.out.println(size);
	for(i=size-1;i>=0;i--) {
		System.out.print(a[i]);
	}
}

*/
	public static int  dectobin(int num) {
		int r,sum=0;
	/*	
		while(num>0) {
			r=num%2;
			sum=sum*10+r;
			num/=2;
		}
		r=0;int rev=0;
		while(sum>0) {
		r=sum%10;
		rev=rev*10+r;
		sum/=10;
		}
		return rev;
	}
	*/
		int i=0;
		while(num>0) {
			r=num%2;
			sum=sum+(r*(int)Math.pow(10, i++));
			num/=2;
		}
		return sum;
	}
	
public static void main(String[]args) {	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println( dectobin(n));
}
	
}




