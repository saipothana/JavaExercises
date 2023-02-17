package Alpha2;
import java.util.Scanner;
public class Arr14Union {
	
	/*

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int n1,n2,i,j=0;
	System.out.println("Enter n1 and n2");
	n1=sc.nextInt();
	n2=sc.nextInt();
	
	
	int a[]=new int[n1];
	int b[]=new int[n2];
	for(i=0;i<n1;i++) {
		System.out.println("enter arr ele "+i);
	a[i]=sc.nextInt();	
	}
	
	for(i=0;i<n2;i++) {
		System.out.println("enter arr ele "+i);
	b[i]=sc.nextInt();	
	}
	
//combine two arrays	
	int c[]=new int[n1+n2];
	
for(i=0;i<n1;i++) {
	c[j++]=a[i];
}

for(i=0;i<n2;i++) {
	c[j++]=b[i];
	
}

System.out.println("the combined array");
System.out.print("[");
for(i=0;i<j;i++) {
	System.out.print(c[i]+",");
}

System.out.println("]");

//sorting the elements in assending order

System.out.println("the sorted array");
for(i=0;i<n1+n2;i++) {
	for(j=i+1;j<n1+n2;j++) {
		if(c[i]>c[j]) {
			c[i]=c[i]+c[j];
			c[j]=c[i]-c[j];
			c[i]=c[i]-c[j];
		}
	}
	
//	System.out.println(c[i]);
}

for(i=0;i<n1+n2;i++) {
	System.out.println(c[i]);
}


System.out.println("a u b");
int n3=n1+n2;
//System.out.println(n3);
int k;
for (i = 0; i < n3; i++) {
	for (j = i + 1; j < n3; j++) {
	if (c[i] == c[j]) {
	for (k = i; k < n3 -1; k++) {
	c[k] = c[k + 1];
	}
	n3--;
	j--;
	}
	}
}


for(i=0;i<n3;i++) {
	System.out.println(c[i]);
}






	
	
}
}


*/
	
	
	
	static Scanner sc = new Scanner(System.in);

	public static void input(int a[], int n) {
	int i = 0;
	while (i < n) {
	System.out.println("Enter element " + i + ": ");
	a[i] = sc.nextInt();
	i++;
	}
	}

	public static void print(int a[], int n) {
	int i = 0;
	System.out.println("Array elements: ");
	while (i < n) {
	System.out.println(a[i]);
	i++;
	}
	}
	
	
	public static int[] dub(int c[],int n3) {
		int i,j,k;
		for (i = 0; i < n3; i++) {
			for (j = i + 1; j < n3; j++) {
			if (c[i] == c[j]) {
			for (k = i; k < n3 -1; k++) {
			c[k] = c[k + 1];
			}
			n3--;
			j--;
			}
			}
		}
		
		int newarr[]=new int[n3];
		for(i=0;i<n3;i++) {
			newarr[i]=c[i];
		}
		
		return newarr;
		
	}
	

	
	public static void main(String[]args) {
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i,j=0;
		int n3=n1+n2;
		int a[]=new int[n1];
		input(a,n1);
		print(a,n1);
		int b[]=new int[n2];
		input(b,n2);
		print(b,n2);
		
		int c[]=new int[n3];
		for(i=0;i<n1;i++) {
			c[j++]=a[i];
		}

		for(i=0;i<n2;i++) {
			c[j++]=b[i];
			
		}

		System.out.println("the combined array");
		print(c,n3);
		
		System.out.println("aub");
		Arr8Sorting.sort(c, n3);//here i,m using the method sort, i created previously inorder to sort the array
		int newarr[]=dub(c,n3);
		
		print(newarr,newarr.length);
		
	}
	
}
