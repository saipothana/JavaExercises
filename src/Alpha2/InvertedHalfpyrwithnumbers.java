package Alpha2;
import java.util.Scanner;
public class InvertedHalfpyrwithnumbers {
public static void invert(int n) {
	int z;
	for(int i=0;i<n;i++) {
		z=1;
		for(int j=0;j<n-i;j++) {
			System.out.print(z++);
		}
		
		System.out.println("");
	}
}

public static void main(String[]args) {
	invert(4);
}
}
