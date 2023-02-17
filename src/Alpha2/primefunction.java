package Alpha2;
import java.util.Scanner;
public class primefunction {
public static boolean isprime(int n) {
	int i;
	
	for(i=2;i<n;i++) {
		if(n%i==0) {
			
			return false;
			
		}
	}
	
	return true;
}


public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(isprime(a));
}
}
