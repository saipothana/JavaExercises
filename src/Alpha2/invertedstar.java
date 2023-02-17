package Alpha2;
import java.util.Scanner;
public class invertedstar {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	/*
	for(int i=n;i>=0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
	System.out.println();	
	}
	
	
}
}
	
	*/
	
	for(int i=1;i<=n;i++) {
		//for(int j=1;j<=n-i+1;j++) {
		
		for(int j=n;j>=i;j--) {
			System.out.print("*");
		}
	System.out.println();	
	}
	
}
}