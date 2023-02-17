package Alpha2;
import java.util.Scanner;
public class Sumofnatural {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	while(num>0) {
	sum+=num;
	num--;
	}
	
	System.out.println(sum);
}
}
