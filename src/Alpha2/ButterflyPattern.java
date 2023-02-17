package Alpha2;
import java.util.Scanner;
public class ButterflyPattern {
public static void butter(int n) {
	int i,j,s,k,p;
	
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(s=i+1;s<=(2*n)-i;s++) {
			System.out.print(" ");
		}
	for(k=1;k<=i;k++) {
		System.out.print("*");
	}
	System.out.println("    ");
	}
	
	
	for(i=n;i>=1;i--) {
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(s=i+1;s<=(2*n)-i;s++) {
			System.out.print(" ");
		}
	for(k=1;k<=i;k++) {
		System.out.print("*");
	}
	
	
	System.out.println("    ");
	}
	}


public static void main(String[]date) {
	butter(4);
	 
}
}
