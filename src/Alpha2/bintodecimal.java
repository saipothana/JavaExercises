package Alpha2;
import java.util.Scanner;
public class bintodecimal {

	public static int bindec(int num) {
		int r,sum=0,i=0;
		while(num!=0) {
			r=num%10;
			
		sum=sum+((int)Math.pow(2, i++))*r;
		
		num/=10;
		}
		
		
		
	return sum;	
	}
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int res=bindec(n);
		System.out.println("the binary of "+n+" is "+res);
	}
}
