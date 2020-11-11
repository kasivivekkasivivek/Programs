package matrix;
import java.util.*;

/*
 3  3
 1  2  3
 4  5  6
 7  8  9
 
 1  2  4  7  5  3  6  8  9
 */
public class Diagonal_Traversal_of_Matrix {
	public static Scanner ss=new Scanner(System.in);
	public static Random rr=new Random();
	
	public static void print(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void diagonal(int arr[][])
	{
		int m=arr.length;
		int n=arr[0].length;
		int row=0;
		int col=0;
		while(row!=m && col!=n)
		{
			System.out.print(arr[row][col]+" ");
			if((row+col)%2==0)
			{
				//upward
				if(col==n-1)
				{
					row++;
				}
				else if(row==0)
				{
					col++;
				}
				else
				{
					row--;
					col++;
				}
			}
			else
			{
					//downwards
				if(row==m-1)
				{
					col++;
				}
				else if(col==0)
				{
					row++;
				}
				else
				{
					col--;
					row++;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows");
		int r1=ss.nextInt();
		System.out.println("Enter the number of columns");
		int c1=ss.nextInt();
		int arr[][]=new int[r1][c1];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=rr.nextInt(100);
			}
		}
		
		print(arr);
		diagonal(arr);
		
			
}
}


