package matrix;
import java.util.*;
public class Selection_Sort
	{
	
	public static Scanner ss=new Scanner(System.in);
	public static Random rr=new Random();
	//method to print the elements in the array
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
		System.out.print(arr[i]+",");	
		}
		System.out.print(arr[arr.length-1]);
		System.out.println();
	}
	/*
	 			Time Complexity: O(n^2)
	 */
	public static void selectionsort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			//finding the position of the minimum element in the array
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			//swapping ith element with min position element
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		print(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=ss.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=rr.nextInt(100);
		}
		print(arr);
		selectionsort(arr);
		
	}

}
