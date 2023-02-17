package Alpha2;
import java.util.Scanner;
public class primeornotprime {
	public static void main(String[]args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter number from 2 : ");
int num=sc.nextInt();

boolean isprime=true;
int i;
for(i=2;i<num;i++) {
	if(num%i==0) {
		isprime=false;
	}
}

System.out.println(isprime);
	}
}
