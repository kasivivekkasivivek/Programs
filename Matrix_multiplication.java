package matrix;
import java.util.*;

public class Matrix_multiplication {
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
	
	//	*******			arr[i][j]+=arr1[i][k]*arr2[k][j] 	********
	public static void multiplication()
	{
		System.out.println("Enter the number of rows in matrix 1");
		int r1=ss.nextInt();
		System.out.println("Enter the number of columns in matrix 1");
		int c1=ss.nextInt();
		int arr1[][]=new int[r1][c1];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				arr1[i][j]=rr.nextInt(100);
			}
		}
		System.out.println("Enter the number of rows in matrix 2");
		int r2=ss.nextInt();
		System.out.println("Enter the number of columns in matrix 2");
		int c2=ss.nextInt();
		int arr2[][]=new int[r2][c2];
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[0].length;j++)
			{
				arr2[i][j]=rr.nextInt(100);
			}
		}
		
		print(arr1);
		print(arr2);
		if(arr1[0].length==arr2.length)
		{
			int arr[][]=new int[arr1.length][arr2[0].length];   //m*n n*k=m*k if n==n
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					for(int k=0;k<arr2.length;k++)
					{
						arr[i][j]+=arr1[i][k]*arr2[k][j];
					}
				}
			}
			print(arr);
		}
		else
		{
			System.out.println("array multiplication not possibel");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Enter the number of rows");
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
		}*/
		
		//print(arr);
		multiplication();
			
}
}


