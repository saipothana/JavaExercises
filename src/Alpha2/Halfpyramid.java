package Alpha2;
import java.util.Scanner;
public class Halfpyramid {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i,j;
	
	for(i=0;i<n;i++) {
		int z=1;
		for(j=0;j<=i;j++) {
		System.out.print(z);
		z++;
		}
		System.out.println("  ");
	}
}
}
