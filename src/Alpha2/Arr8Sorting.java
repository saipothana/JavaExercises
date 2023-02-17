package Alpha2;
import java.util.Scanner;
public class Arr8Sorting {

	
	/*
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int a[]=new int[n];
	int i,j,temp=0;
	for(i=0;i<a.length;i++) {
		System.out.println("Enter array ele"+i);
		a[i]=sc.nextInt();
		
		
	}
	System.out.println("Before sort");
	for(i=0;i<a.length;i++) {
		
		for(j=i+1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
			
			else {
				a[i]=a[i];
			}
			
		}
		
		System.out.println(a[i]);
		
		
	}
}
}

*/
	
	
static Scanner sc=new Scanner(System.in);

public static void input(int a[],int n) {
	int i=0;
	while(i<n) {
		System.out.println("ENtre ele"+i);
		a[i]=sc.nextInt();
		i++;
	}
}

public static void print(int a[],int n) {
	int i=0;
	while(i<n) {
		System.out.println(a[i]);
		i++;
	}
}

public static void sort(int a[],int n) {
	int i,j,temp;
	
	for(i=0;i<a.length;i++) {
		
	temp=0;
		for(j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else {
				a[i]=a[i];
			}
		}
		
		System.out.println(a[i]);
	}
}


public static void main(String[]args) {
int n=sc.nextInt();
	
	int a[]=new int[n];
	
	input(a,n);
	print(a,n);
	sort(a,n);
}
}
