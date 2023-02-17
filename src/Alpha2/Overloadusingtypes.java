package Alpha2;
import java.util.Scanner;
public class Overloadusingtypes {
	
	
	public static int mul(int a,int b) {
		return a*b;
	}
	
	public static float mul(float a,float b) {
		return a*b;
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
float a=sc.nextFloat();
float b=sc.nextFloat();
System.out.println(mul(a,b));
}
}
