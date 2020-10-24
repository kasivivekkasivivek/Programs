package matrix;
import java.util.*;
public class Bubble_Sort
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
	 Time complexity :- The below function runs O(n^2) time even if the array is sorted.
	 */
	public static void bubblesort(int arr[])
	{
		for(int i=1;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)	//arr.length-1-i **
			{
				if(arr[j]>arr[j+1])
				{
					//swap the elements
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Elements after swapping the elements");
		print(arr);
	}
	
	/*
	 Making the algoritham better
	 Worst and Average Case Time Complexity: O(n^2). Worst case occurs when array is reverse sorted.
	 Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
	 */
	public static void bubblesort2(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			boolean swap=false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					//swapping the elements 
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			//if there is no swap in a iteration then break it because it is already sorted
			if(swap==false)
			{
				break;
			}
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
		
		bubblesort2(arr);
	}

}
