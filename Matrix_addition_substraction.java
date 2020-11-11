package matrix;
import java.util.*;

public class Matrix_addition_substraction {
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
	
	public static void addition()
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
		if(arr1.length==arr2.length && arr1[0].length==arr2[0].length)
		{
			int arr3[][]=new int[arr1.length][arr1[0].length];
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr1[0].length;j++)
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			print(arr3);
		}
		else
		{
			System.out.println("Matrix addition not possible");
		}
	}
	
	public static void substraction()
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
		if(arr1.length==arr2.length && arr1[0].length==arr2[0].length)
		{
			int arr3[][]=new int[arr1.length][arr1[0].length];
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr1[0].length;j++)
				{
					arr3[i][j]=arr1[i][j]-arr2[i][j];
				}
			}
			print(arr3);
		}
		else
		{
			System.out.println("Matrix substraction not possible");
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
		addition();
		substraction();

}
}


