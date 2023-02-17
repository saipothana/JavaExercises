package Alpha2;
import java.util.Scanner;
public class BinaryTriangle {
public static void binary(int n) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			if((i%2==0&&j%2==0)||(i%2!=0&&j%2!=0)) {
		System.out.print("1");	
			}
			else {
				System.out.print("0");		
			}
		}
	System.out.println("");
	}
}

public static void main(String[]args) {
	binary(5);
}
}
