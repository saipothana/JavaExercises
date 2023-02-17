package Alpha2;
import java.util.Scanner;
public class overloadusingparametres {
public static int add(int a,int b) {
	return a+b;
}

public static int add(int a,int b,int c) {
	return c+add(a,b);
}


public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println(add(a,b));
	int res=add(a,b,c);
	System.out.println(res);
	
}
}
