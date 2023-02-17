package Alpha2;
import java.util.Scanner;
public class Reversenum {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in) ;
		int num=sc.nextInt();
		int r,rev=0;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num/=10;
		//System.out.println(rev);
		}
		System.out.println(rev);
	}
}

