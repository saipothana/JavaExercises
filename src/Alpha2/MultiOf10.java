package Alpha2;
import java.util.Scanner;
public class MultiOf10 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
/*		
int num = 0;
	while(num>=0) {
		num=sc.nextInt();
		if(num%10==0) {
			break;
		}
	}
	System.out.println("come out");
	}

}

*/
		do {
			int num=sc.nextInt();
			if(num%10==0) {
				break;
			}
			System.out.println(num);
		}while(true);
	}
}
