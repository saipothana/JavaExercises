//Basic matrix

package Alpha2;
import java.util.Scanner;
public class twod1 {

	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int i,j;

		System.out.println("enter rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int a[][]=new int[row][col];
		
		for(i=0;i<row;i++) {
			System.out.println("Enter row"+i);
			for(j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
			
			
		}
		
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]);
			}
			
			System.out.println("");
		}
		
		
	}
}
