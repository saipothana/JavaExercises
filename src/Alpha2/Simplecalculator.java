package Alpha2;
import java.util.*;
public class Simplecalculator {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a and B: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	char choose = sc.next().charAt(0);
	
	switch(choose) {
	case 'a':System.out.println("ADDition:"+(a+b));
	break;
	case 'b':System.out.println("subition:"+(a-b));
	break;
	case 'c':System.out.println("divition:"+(a/b));
	break;
	case 'd':System.out.println("mulition:"+(a*b));
	break;
	case 'e':System.out.println("moDition:"+(a%b));
	break;
	default:System.out.println("Wrong choice");
	
	}
	
}
}
