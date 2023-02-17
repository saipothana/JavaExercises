package Alpha2;
import java.util.Scanner;
public class Diamondpattern {
public static void diamond(int n) {
	int i,sp,j;
	
	for(i=1;i<=n;i++) {
		for(sp=1;sp<=n-i;sp++) {
			System.out.print(" ");
		}
		
		for(j=1;j<=(2*i)-1;j++) {
			System.out.print("*");
		}
		
		System.out.println(" ");
	}
	
	
	
	for(i=n;i>=1;i--) {
		for(sp=1;sp<=n-i;sp++) {
			System.out.print(" ");
		}
		
		for(j=1;j<=(2*i)-1;j++) {
			System.out.print("*");
		}
		
		System.out.println(" ");
	}
	}


public static void main(String[]scanf) {
	diamond(4);
}
}
