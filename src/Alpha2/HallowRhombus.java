package Alpha2;
import java.util.Scanner;
public class HallowRhombus {
public static void hallow(int n) {
	int i,sp,j;
	
	for(i=1;i<=n;i++) {
		for(sp=1;sp<=n-i;sp++) {
			System.out.print(" ");
		}
		
		for(j=1;j<=n;j++) {
			if(i==1||i==n||j==1||j==n) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	System.out.println(" ");
	}
}

public static void main(String[]args)
{
	hallow(10);
	
}
}
