package Alpha2;
import java.util.Scanner;

public class swapnumberscallbyvalue {
	
	public static void swap(int a,int b) {
		a=a+b;
		b=a-b;
		System.out.println(b);
		a=a-b;
		System.out.println(a);
		return;
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	swap(a,b);
	System.out.println("a "+a+"b "+b);
}
}
