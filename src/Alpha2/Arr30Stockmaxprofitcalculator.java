package Alpha2;
import java.util.*;
public class Arr30Stockmaxprofitcalculator {

	public static int stock(int p[],int n) {
		
		
		int bp=p[0],sp,i,j,max=0,profit=0;

		for(i=0;i<n;i++) {
			
				
			bp=Math.min(bp,p[i]);
			max=p[i]-bp;
			if(profit<max) {
				profit=max;
			}
			
			
			
		}
		if(profit<0) {
		return -1;
		}
		else {
			return profit;
		}
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
