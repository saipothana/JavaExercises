package Alpha2;
import java.util.Scanner;
public class factorialnum {
public static int fact(int num) {
	int i = 0,sum=1;
	/*
	for(i=1;i<=num;i++) {
		sum=sum*i;
	}
	*/
	while(num>=1) {
		sum*=num--;
	}
	return sum;
}

public static void main(String[]my) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int res=fact(n);
	System.out.println(n+"!"+" = "+res);
}
}
