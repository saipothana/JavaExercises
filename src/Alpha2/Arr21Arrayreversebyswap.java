package Alpha2;
import java.util.Scanner;
public class Arr21Arrayreversebyswap {

	
	public static void rev(int a[],int n) {
		int b=0,c=n-1,temp=0,i;
		
		for(i=b;i<c;i++) {
			temp=a[b];
			a[b]=a[c];
			a[c]=temp;
			
			b++;
			c--;
			
			
		}
		
		
	}
	
	
	public static void main(String[]args) {
		int num[]= {2,4,6,8,10};
		rev(num,num.length);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}
