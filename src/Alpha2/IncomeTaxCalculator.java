package Alpha2;
import java.util.Scanner;
public class IncomeTaxCalculator {
	public static void main(String[]args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income in double\n");
	Long income=sc.nextLong();
	double tax=0;
	
	if(income<500000) {
		tax=0;
	}
	else if(income>500000&&income<1000000) {
		tax=(income*20)/100;
	}
	else if(income>1000000) {
		tax=(income*30)/100;
	}

	System.out.println(tax);
}
}
