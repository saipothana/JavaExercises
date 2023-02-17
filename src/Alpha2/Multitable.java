package Alpha2;
import java.util.Scanner;
public class Multitable {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int table=sc.nextInt();
	
	int i;
	for(i=1;i<=10;i++) {
		System.out.println(table+" * "+i+" = "+table*i);
	}
}
}
