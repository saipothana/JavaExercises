//A-B

package Alpha2;
import java.util.Scanner;
public class Arr16subofAandB {
	/*
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int n1,n2,i,j=0,k;
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
	
	
	
	for(i=0;i<n1;i++) {
		for(j=0;j<n2;j++) {
			
			if(a[i]==b[j]) {
			for(k=i;k<n1-1;k++) {
			a[k]=a[k+1];	
			}
			
			for(k=j;k<n2-1;k++) {
				b[k]=b[k+1];
			}
			j--;
			n1--;
			n2--;
}
}
		
	}
	
	
	for(i=0;i<n1;i++) {
		System.out.println(a[i]);
		
	}
	
	for(i=0;i<n2;i++) {
		System.out.println(b[i]);
		
	}
	
	
	int c[]=new int[n1+n2];
	int size=0;
	for(i=0;i<n1;i++) {
		c[size++]=a[i];
	}
	

	for(i=0;i<n2;i++) {
		c[size++]=b[i];
	}
	
	System.out.println("combined");
	for(i=0;i<size;i++) {
	System.out.println(c[i]);	
	}
	
	for(i=0;i<size;i++) {
		for(j=i+1;j<size;j++) {
			if(c[i]==c[j]) {
				for(k=i;k<size-1;k++) {
					c[k]=c[k+1];
				}
				
				j--;
				size--;
			}
		}
	}
	
	for(i=0;i<size;i++) {
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
	
	
	public static int[]  AminusB(int a[],int b[],int n1,int n2) {
		int i,j,k;
		for(i=0;i<n1;i++) {
			for(j=0;j<n2;j++) {
				
				if(a[i]==b[j]) {
				for(k=i;k<n1-1;k++) {
				a[k]=a[k+1];	
				}
				j--;
				n1--;
				}
			}
		}
	
		int newarr1[]=new int[n1];
		for(i=0;i<n1;i++) {
			
			newarr1[i]=a[i];
		}
		
		return newarr1;
	}
	
	public static int[] BminusA(int a[],int b[],int n1,int n2) {
	    int i, j, k;
	    for (i = 0; i < n2; i++) {
	        for (j = 0; j < n1; j++) {
	            if (b[i] == a[j]) {
	                for (k = i; k < n2 - 1; k++) {
	                    b[k] = b[k + 1];
	                }
	                i--;
	                n2--;
	            }
	        }
	    }

	    int newarr2[] = new int[n2];
	    for (i = 0; i < n2; i++) {
	        newarr2[i] = b[i];
	    }

	    return newarr2;
	}

	
	
	public static int[] combine(int a[],int b[],int n1,int n2) {
		int n3=n1+n2,i,j,k,size=0;
		int c[]=new int[n3];
		for(i=0;i<n1;i++) {
		c[size++]=a[i];	
		}
		
		for(i=0;i<n2;i++) {
			c[size++]=b[i];	
			}
		
	return c;
	}
	
	public static int[] symmetric(int c[],int size) {
		int i,j,k;

		for(i=0;i<size;i++) {
			for(j=i+1;j<size;j++) {
				if(c[i]==c[j]) {
					for(k=i;k<size-1;k++) {
						c[k]=c[k+1];
					}
					
					j--;
					size--;
				}
			}
	
	}
		return c;
		
	}
	
	
	public static void main(String[]args) {
		
	int n1=sc.nextInt();
	int n2=sc.nextInt();
		int a[]=new int[n1];
		input(a,n1);
		print(a,n1);
		int b[]=new int[n2];
		System.out.println("=======secondarray========");
		input(b,n2);
		print(b,n2);
		
		int newarr1[]=AminusB(a,b,n1,n2);
		System.out.println("A-nb");
		
		print(newarr1,newarr1.length);
		
		int newarr2[]=BminusA(a,b,n1,n2);
		
System.out.println("b-na");
		
		print(newarr2,newarr2.length);
	
		
		
		System.out.println("combined array");
	int newarr3[]=	combine(newarr1,newarr2,newarr1.length,newarr2.length);
	print(newarr3,newarr3.length);
	
	int newarr4[]=symmetric(newarr3,newarr3.length);
		System.out.println("Sym Array");
		print(newarr4,newarr4.length);
		
		
		
	}
}