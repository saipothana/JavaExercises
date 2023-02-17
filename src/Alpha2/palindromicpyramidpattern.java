package Alpha2;
import java.util.Scanner;
public class palindromicpyramidpattern {
public static void palpyr(int n) {
	int i,j,k,sp,x=1,y,z;
	
	for(i=1;i<=n;i++) {
		for(sp=1;sp<=n-i;sp++) {
			System.out.print(" ");
		}
		

y=x;
z=2;
		for(j=1;j<=i;j++) {
			
			System.out.print(y--);
			
		}
		
		for(k=2;k<=i;k++) {
			System.out.print(z++);
		}
		x++;
		System.out.println(" ");
	}
}

public static void main(String[]args) {
	palpyr(5);
}
}
