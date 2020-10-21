package matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	public static Scanner ss=new Scanner(System.in);
	public static Random rr=new Random();
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
	 Binary Search: Search a **sorted array** by repeatedly dividing the search interval in half
	 */
			//time complexity -------> O(Log n)
	public static void BinarySearch(int arr[])
	{
		print(arr);
		System.out.println("Enter the element to search");
		int key=ss.nextInt();
		//for Binary Search Array need to be sorted because it works only for sorted arrays
		//sorting using inbuilt method
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int position=-1;
		while(left<=right)
		{
			int mid=left+(right-left)/2;     //important
			if(arr[mid]==key)
			{
				position=mid;
				System.out.println("Element is found at position :"+(position+1));
				break;
			}
			if(arr[mid]<key)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		if(position==-1)
		{
			System.out.println("Element is not present in the array");
		}
		
	}
	
	//java libraries provide inbuilt function for binary search
	//Arrays.binarysearch(arr,key);
	public static void BinarySearch2(int arr[])
	{
		System.out.println("Enter the element to search");
		int key=ss.nextInt();
		int position=Arrays.binarySearch(arr, key);
		
		if(position<0)
		{
			System.out.println("Element is not present in the array");
		}
		else
		{
			System.out.println(position+1);
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
		BinarySearch(arr);
		BinarySearch2(arr);
	}

}
