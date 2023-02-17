package Alpha2;
import java.util.Scanner;
public class primefunctionrange {
public static void isprime(int a,int n) {
	int i,j,flag;
	/*
	for(i=a;i<=n;i++) {
		flag=0;
	for(j=1;j<=i;j++) {	
		if(i%j==0) {
		flag++;
		}
	}
	if(flag==2) {
		System.out.println(" "+i+"is prime");
	}
	}
}

*/
	boolean isprime;
	
	for(i=a;i<=n;i++) {
		
	isprime=true;
		for(j=2;j<i;j++) {
			if(i%j==0) {
				isprime=false;
			}
		}
		if(isprime==true) {
		System.out.println(i+" is prime "+isprime);
		}
	}
	
}
	

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
          isprime(a,b);
}
}
