package Alpha2;
import java.util.Scanner;
public class Arr4Splitarrayevenodd {
	
	
	
	
	/*

public static void main(String[]args) {
	
	
	
	Scanner sc=new Scanner(System.in);
	int i,j,n,psize=0,csize=0;
	boolean isprime;
	n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int c[]=new int[n];
	for(i=0;i<a.length;i++) {
		System.out.println("Entre ele"+i);
		a[i]=sc.nextInt();
		
	}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		
		for(i=0;i<n;i++) {
			isprime=true;
			for(j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					isprime=false;
				}
			}
			if(isprime==true) {
				b[psize++]=a[i];
			}
			else {
				c[csize++]=a[i];
			}
		}
		
		
		System.out.println("Prime array");
	  for(i=0;i<psize;i++) {
		  System.out.println(b[i]);
	  }
	  System.out.println("compo");
	  for(i=0;i<csize;i++) {
		  System.out.println(c[i]);
	  }
	}
	
}


*/
	/**********methods***********************/
	
static Scanner sc=new Scanner(System.in);
public static void input(int a[],int n) {
	for(int i=0;i<a.length;i++) {
		System.out.println("Entre ele"+i);
		a[i]=sc.nextInt();
		
	}
}

public static void output(int a[],int n) {
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	
}

public static void prime(int a[],int n) {
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
}


public static void compo(int a[],int n) {
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
}

public static void main(String[]args) {
	int n=sc.nextInt();
	int i,j,psize=0,csize=0;
	int a[]=new int[n];
	int b[]=new int[n];
	int c[]=new int[n];
	input(a,n);
	output(a,n);
	int flag;
	
	for(i=0;i<n;i++) {
		flag=0;
		for(j=1;j<=a[i];j++) {
			if(a[i]%j==0) {
				flag++;
			}
		}
		if(flag==2) {
			b[psize++]=a[i];
		}
		else {
			c[csize++]=a[i];
		}
	}
	
	System.out.println("prime");
	prime(b,psize);
	System.out.println("compo");
	compo(c,csize);
	
}
}


