package Alpha2;
import java.util.Scanner;
public class evenfunction {
	public static boolean iseven(int num) {
		if(num%2==0) {
			return true;
		}
		
		return false;
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(iseven(n));
}
}
