package Alpha2;
import java.util.Scanner;
public class Arr31stocksellbuy {

	
public static int stock(int p[],int n) {
		
	int bp=Integer.MAX_VALUE;
	int maxprofit=0,profit,i;
	
	for(i=0;i<n;i++) {
		if(bp<p[i]) {
			profit=p[i]-bp;
			maxprofit=Math.max(maxprofit,profit);
		}
		else {
		bp=p[i];
	}
	}
	
	return maxprofit;
	}
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter arr ele"+i);
			a[i]=sc.nextInt();
			
			
		}
		
		int maxpro=stock(a,n);
		System.out.println("max profit = "+maxpro);
	}

}
