package Alpha2;
import java.util.Scanner;
public class SolidRhombus {
	public static void solid(int n) {
		int sp,i,j;
		
		for(i=1;i<=n;i++) {
			for(sp=1;sp<=n-i;sp++) {
				System.out.print(" ");
			}
			
			for(j=1;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[]args) {
		solid(4);
	}

}
