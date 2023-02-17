package Alpha2;
import java.util.Scanner;
public class palindromefunction {
	public static int palin(int num) {
		int rev=0,i;
		while(num>0) {
			i=num%10;
			rev=rev*10+i;
			num/=10;
		}
		
		return rev;
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==palin(n)) {
		System.out.println("pal");
	}
	else {
		System.out.println("not pali");
	}
}
}
