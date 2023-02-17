package Alpha2;
import java.util.Scanner;
public class invertedrotated {
public static void invert(int n) {
	int i,j,k;
	for(i=n;i>0;i--) {
	for(j=i;j>1;j--) {	
	
System.out.print(" ");
	}
	for(k=i;k<=n;k++) {
		System.out.print("*");	
	}
	
	
	
	System.out.println("");
	}
}

public static void main(String[]args) {
	//Scanner sc=new Scanner(System.in);
	invert(4);
}
}
