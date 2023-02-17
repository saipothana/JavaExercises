package Alpha2;
import java.util.Scanner;
public class Arr22Pairsofanarray {
	/*

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter arr size");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	int i=0,j,k=0;
	
	while(i<n) {
		System.out.println("ENter arr ele"+i);
		a[i]=sc.nextInt();
		i++;
	}
	
	for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			System.out.print("( "+a[i]+","+a[j]+" )"+" ");
			k++;
		}
		System.out.println(" ");
	}
	
	System.out.println(k);
}
}

	*/
	
	
	public static int  pair(int a[],int n) {
		
int i,j,k=0;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				System.out.print("( "+a[i]+","+a[j]+" )"+" ");
				k++;
			}
			System.out.println(" ");
		}
		
		return k;
	}
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arr size");
		int n=sc.nextInt();
		
		int a[]=new int[n];
Arr9Inserting.input(a, n);
Arr9Inserting.print(a, n);

int z=pair(a,n);
System.out.println("total count is "+z);
	}

	}