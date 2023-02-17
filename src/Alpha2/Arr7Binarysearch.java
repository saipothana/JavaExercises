package Alpha2;
import java.util.Scanner;
public class Arr7Binarysearch {
	
	
	/*

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter arr size" );
	n=sc.nextInt();
	int a[]=new int[n];
	
	System.out.println("Entre ele to search");
	int sr=sc.nextInt();
	int i=0;
	for(i=0;i<n;i++) {
		System.out.println("ENtre ele "+i);
		a[i]=sc.nextInt();
		
	}
	int low=0;
	int high=n-1;
	int mid=0;
	
	while(low<=high) {
		
		mid=(low+high)/2;
		
		if(a[mid]==sr) {
			break;
		}
		else if(sr>a[mid]) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		
		
	}
	
	
	if(low<=high) {
		System.out.println(sr+"ele found in pos"+mid);
	}
	else {
		System.out.println("not found");
	}
	
	
	
}
}

*/
	
/******Method****************/
	
	static Scanner sc=new Scanner(System.in);
	
public static void input(int a[],int n) {
		
		int i=0;
			while(i<n) {
				System.out.println("Entre ele"+i);
				a[i]=sc.nextInt();
				i++;
			}
		}
	
	
	public static void output(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static int  search(int a[],int n,int sr ) {
		
		int low=0;
		int high=n-1;
		int mid=0;
		
		while(low<=high) {
			
			mid=(low+high)/2;
			
			if(a[mid]==sr) {
				break;
			}
			else if(sr>a[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
			
		}
		
		return mid;
	}
	
	
	
	public static void main(String[]args) {
		
		int n,sr;
		
			System.out.println("enter size");
			 n=sc.nextInt();
			 
			 int a[]=new int[n];
			 System.out.println("Enter element to search");
			 sr=sc.nextInt();
			 input(a,n);
			 output(a,n);
			 
			 int res=search(a,n,sr);
			 if(res>=0&&res<n) {
				 System.out.println(sr+"ele found in pos"+res); 
			 }
			 else {
				 System.out.println(sr+"not found"); 
			 }
	}
}