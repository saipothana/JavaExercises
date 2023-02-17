package Alpha2;
import java.util.Scanner;
public class twodcolumnmatrix {

static Scanner sc=new Scanner(System.in);
public static void input(int a[][],int r,int c) {
	int i,j;
	for(i=0;i<a.length;i++) {
		System.out.println("Enter row"+i);
		for(j=0;j<a[0].length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
}

public static void print(int a[][],int r,int c) {
	int i,j;
	if(c==1) {
		
	System.out.println("It is a column matrix");
	for(i=0;i<a.length;i++) {
		for(j=0;j<a[0].length;j++) {
			System.out.print(a[i][j]);
			
		}
		System.out.println("");
	}
	
	}
	
	else {
		System.out.println("not a column");
	}
	
}

public static void main(String[]args) {
	int row=sc.nextInt();
	int col=sc.nextInt();
	int a[][]=new int[row][col];
	
	input(a,row,col);
	print(a,row,col);
}

}




