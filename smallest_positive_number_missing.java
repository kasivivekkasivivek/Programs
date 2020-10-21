package matrix;
import java.util.*;
public class smallest_positive_number_missing 
	{
	/*
	 Find the smallest positive number missing from an unsorted array 
			 Input: arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
			 Output: 1
		
			Input: arr[] = { 2, 3, -7, 6, 8, 1, -10, 15 }
			Output: 4
			
			Input: arr[] = {1, 1, 0, -1, -2}
			Output: 2
	 */
	public static Scanner ss=new Scanner(System.in);
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
	//solution using binary search
	public static void finding1(int arr[])
	{
		Arrays.parallelSort(arr);	//sorting the array
		int x=arr[arr.length-1];
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(Arrays.binarySearch(arr, i)<0) //if smallest starting from 1 is not present in the array the element will be printed
			{
				System.out.println(i);
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(arr[arr.length-1]+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n1=ss.nextInt();
		int arr[]=new int[n1];
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=ss.nextInt();
		}
		print(arr);
		finding1(arr);
		
		
	}

}
