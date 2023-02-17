//merge of array

package Alpha2;
import java.util.Scanner;
public class Arr3MergeofArray {

	
	/*

	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int a[]=new int[n1];
	int b[]=new int[n2];
	int c[]=new int[n1+n2];
	int i,j=0;
	
	for(i=0;i<a.length;i++) {
		System.out.println("enter ele1 "+i);
		a[i]=sc.nextInt();
		
	}
	

	for(i=0;i<b.length;i++) {
		System.out.println("enter ele2 "+i);
		b[i]=sc.nextInt();
		
	}
	
	for(i=0;i<a.length;i++) {
		c[j++]=a[i];
	}
	
	for(i=0;i<b.length;i++) {
		c[j++]=b[i];
	}
	
	for(i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
	
	
}
}

	*/
	
	
	
	//method
	
	static Scanner sc=new Scanner(System.in);
	


public static void merge(int a[],int n1,int b[],int n2,int c[]) {
	int j=0;
	for(int i=0;i<a.length;i++) {
		c[j++]=a[i];
	}
	
	for(int i=0;i<b.length;i++) {
		c[j++]=b[i];
	}
	
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
	
}


public static void main(String[]args) {
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int a[]=new int[n1];
	int b[]=new int[n2];
	int c[]=new int[n1+n2];
int i,j;
	for(i=0;i<a.length;i++) {
		System.out.println("enter ele1 "+i);
		a[i]=sc.nextInt();
		
	}
	

	for(i=0;i<b.length;i++) {
		System.out.println("enter ele2 "+i);
		b[i]=sc.nextInt();
		
	}
	
	merge(a,n1,b,n2,c);
	
}
}
	