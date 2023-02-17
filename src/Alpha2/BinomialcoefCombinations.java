package Alpha2;
import java.util.Scanner;
public class BinomialcoefCombinations {
public static int fact(int n) {
	int sum=1;
	while(n>=1) {
		sum*=n--;
	}
	return sum;
}


public static int fact(int n,int r) {
	//Scanner sc=new Scanner(System.in);
	int num=fact(n);
	
	int num1=fact(r)*fact(n-r);
	
	return num/num1;
}

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=sc.nextInt();
	System.out.println(fact(n,r));
}
}
