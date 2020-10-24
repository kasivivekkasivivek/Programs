package matrix;
import java.util.*;
public class Insertion_Sort
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
	 ** is just like playing cards game
	     1: Iterate from arr[1] to arr[n] over the array.
	    2: Compare the current element (key) to its predecessor.
		3: If the key element is smaller than its predecessor, compare it to the elements before. 
			Move the greater elements one position up to make space for the swapped element.
			
			
	 						Time Complexity: O(n*2)
	 */
	public static void insertionsort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
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
		insertionsort(arr);
		
	}

}
