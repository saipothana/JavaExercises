package Alpha2;
import java.util.Scanner;
public class EveOdd {
	public static void main(String[]jeev) {
		Scanner sc=new Scanner(System.in);
		int choice,es=0,os=0;
		
		
		do {
			int n=sc.nextInt();
			if(n%2==0) {
				es=es+n;
			}
			else {
				os=os+n;
			}
			System.out.println("do yu want to continue");
			choice=sc.nextInt();
		}
		while(choice==1);
		
		System.out.println(es+"   "+os);
		
		
	}

}
