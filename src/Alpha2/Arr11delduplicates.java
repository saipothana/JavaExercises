package Alpha2;
import java.util.Scanner;
public class Arr11delduplicates {
	/*

public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
     int i,j,k;
     int n = sc.nextInt();
     int a[] = new int[n+1];
     for (i = 0; i < n; i++) {
         System.out.println("Enter ele" + i);
         a[i] = sc.nextInt();
     }

     for(i=0;i<n;i++) {
    	 for(j=i+1;j<n;j++) {
    		 if(a[i]==a[j]) {
    			 for(k=i;k<n;k++) {
    				 a[k]=a[k+1];
    			 }
    			 n--;
    			 j--;
    		 }
    	 }
     }
     
     
     for(i=0;i<n;i++) {
    	 System.out.println(a[i]);
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

	public static int[] deldub(int a[], int n) {
	int i, j, k;
	for (i = 0; i < n; i++) {
	for (j = i + 1; j < n; j++) {
	if (a[i] == a[j]) {
	for (k = i; k < n-1 ; k++) {
	a[k] = a[k + 1];
	}
	n--;
	j--;
	}
	}
	}
	int[] newArr = new int[n];
	for (i = 0; i < n; i++) {
	newArr[i] = a[i];
	}
	return newArr;
	}

	public static void main(String[] args) {
	System.out.println("Enter the number of elements: ");
	int n = sc.nextInt();
	int a[] = new int[n];
	input(a, n);
	print(a, n);
	int newarr[] = deldub(a, n);
	print(newarr, newarr.length);
	}
	}
