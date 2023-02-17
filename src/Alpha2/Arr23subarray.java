package Alpha2;
import java.util.Scanner;
public class Arr23subarray {

	
	public static int  subarr(int a[],int n) {
		int i,j,k,l,m;
		int totalsubarr=0;
		for(i=0;i<n;i++) {
			l=i;
			
			for(j=l;j<n;j++) {
			for(k=i;k<=j;k++) {
				System.out.print(a[k]+" ");
			}
			totalsubarr++;
			System.out.println(" ");
			}
		}
		
		return totalsubarr;
	}
	
	

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arr size");
		int n=sc.nextInt();
		
		int a[]=new int[n];
Arr9Inserting.input(a, n);
Arr9Inserting.print(a, n);

int to=subarr(a,n);

System.out.println(to);

	}

	}

