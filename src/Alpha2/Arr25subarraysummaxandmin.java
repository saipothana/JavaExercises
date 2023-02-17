package Alpha2;
import java.util.Scanner;
public class Arr25subarraysummaxandmin {
	
	public static int  subarrsum(int a[],int n) {
		int i=0,j,k,l,m,sum,max=0,min;
		min=a[i];
		int totalsubarr=0;
		for(i=0;i<n;i++) {
			l=i;
			
			for(j=l;j<n;j++) {
				
			sum=0;
			for(k=i;k<=j;k++) {
				System.out.print(a[k]+" ");
				sum=sum+a[k];
			}
			System.out.print(" sum  ="+sum);
			if(sum>max) {
			max=sum;	
			}
			
			if(sum<min) {
				min=sum;
			}
			totalsubarr++;
			System.out.println(" ");
			}
		}
		
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		
		return totalsubarr;
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter arr size");
	int n=sc.nextInt();
	
	int a[]=new int[n];
Arr9Inserting.input(a, n);
Arr9Inserting.print(a, n);

int to=subarrsum(a,n);

System.out.println(to);
}
}
