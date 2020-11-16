package matrix;
import java.util.*;

/*
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4
Sum of elements between indices
2 and 4 is 20 + 3 + 10 = 33
*/
public class Find_subarray_with_given_sum {
	public static Scanner ss=new Scanner(System.in);
	public static Random rr=new Random();
	//print array
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]);
		System.out.println();
	}
	//print subarray
	public static void printsubarray(int arr[],int l,int r)
	{
		System.out.print("[");
		for(int i=l;i<r;i++)
		{
			System.out.print(arr[i]+",");
			
		}
		System.out.print(arr[r]+"] ");
	}
	
	//subarrays with given sum in an array	--> the time complexity is O(n^3)-->O(n^2) for subarray and O(n) for printing
	public static void sum_subarray(int arr[])
	{
		System.out.println("Enter the sum");
		int key=ss.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			int cur=0;
			for(int j=i;j<arr.length;j++)
			{
				cur=cur+arr[j];
				if(cur==key)
				{
					printsubarray(arr,i,j);
				}
			}
		}
	}
	
	//subarray with given sum in array with time complexity of O(n)
	public static void sum_subarray2(int arr[])
	{
		System.out.println("Enter the sum");
		int key=ss.nextInt();
		int cur=arr[0];
		int l=0;
		for(int i=1;i<arr.length;i++)
		{
			while(cur>key && l<i-1)
			{
				cur=cur-arr[l];
				l++;
			}
			if(cur==key)
			{
				printsubarray(arr,l,i-1);	
			}
			if(i<arr.length)
			{
				cur=cur+arr[i];
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=ss.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=rr.nextInt(100);
		}
		print(arr);
		sum_subarray(arr);
		sum_subarray2(arr);
		
		
}
}


