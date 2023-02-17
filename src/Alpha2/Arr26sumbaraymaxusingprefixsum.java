package Alpha2;
import java.util.Scanner;
public class Arr26sumbaraymaxusingprefixsum {
public static void prefixsum(int a[],int n) {
	int i,j,k,l;
	int max=Integer.MIN_VALUE;
	int sum=0;
	int prefix[]=new int[n];
	prefix[0]=a[0];
	for(i=1;i<prefix.length;i++) {
		prefix[i]=prefix[i-1]+a[i];
	}
	
	for(i=0;i<n;i++) {
		l=i;
		
		for(j=l;j<n;j++) {
//System.out.println("the "+prefix[i]);
		sum=(l==0)?prefix[j]:prefix[j]-prefix[l-1];
		if(max<sum) {
			max=sum;
		}
		}
	}
	
	System.out.println("max= "+max);
}

	
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	
	Arr8Sorting.input(a, n);
	Arr8Sorting.print(a, n);
prefixsum(a,n);
}
}
