package Alpha2;
import java.util.Scanner;
public class Arr13sccondmaxmin {

	
	/*
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	 int i,j,k;
    int n = sc.nextInt();
    int a[] = new int[n];
    for (i = 0; i < n; i++) {
        System.out.println("Enter ele" + i);
        a[i] = sc.nextInt();
    }
    
    //sort the array either assend or descend
    
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
    
    System.out.println("sec min"+a[1]+"sec max"+a[n-2]);
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
	
	public static int[] sec(int a[], int n) {
	int i,j;
	
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
	
	}
//in above i got two values so i take them in an array and return array here
int newarr[]= {a[1],a[n-2]};

return newarr;
	}
	
	
	
	public static void main(String[]args) {
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		input(a, n);
		print(a, n);
		
		int newa[]=sec(a,n);
		
		print(newa,newa.length);
		System.out.println("min"+newa[0]);
		System.out.println("max"+newa[1]);
		
	}
	
}
