package Alpha2;
import java.util.Scanner;
public class Numberpyramid {
public static void pyr(int n) {
	int i,j,sp;
	for(i=1;i<=n;i++) {
		for(sp=1;sp<=n-i;sp++) {
			System.out.print(" ");
		}
		
		for(j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		
		
		System.out.println(" ");
	}
}

public static void main(String[]args) {
	pyr(10);
}
}
