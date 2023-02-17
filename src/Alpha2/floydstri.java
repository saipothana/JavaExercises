package Alpha2;
import java.util.Scanner;
public class floydstri {
public static void floyd(int n) {
	int i,j,k=1;
	
	for(i=0;i<n;i++) {
		for(j=0;j<=i;j++) {
			System.out.print(k++);
		}
		System.out.println("");
	}
}

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	floyd(n);
}
}
