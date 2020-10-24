package matrix;
import java.util.*;
public class Merge_Sort
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
	 Merge Sort is a Divide and Conquer algorithm.
	 It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves
	 Time complexity of Merge Sort is O(n*Log n)
	 */
	public static void merge(int arr[],int left,int middle,int right)
	{
		//initializing the size of leftarray
		int n1=middle-left+1;
		int leftarray[]=new int[n1];
		//initializing the size of right array
		int n2=right-middle;
		int rightarray[]=new int[n2];
		
		//copy element into leftarray and right array
		for(int i=0;i<leftarray.length;i++)
		{
			leftarray[i]=arr[left+i];	//left+i **
		}
		for(int i=0;i<rightarray.length;i++)
		{
			rightarray[i]=arr[middle+1+i];
		}
		//condition for copying the elements
		int i=0,j=0,k=left; 		//k=left **;
		while(i<n1 && j<n2)
		{
			if(leftarray[i]<=rightarray[j])
			{
				arr[k]=leftarray[i];
				i++;
			}
			else
			{
				arr[k]=rightarray[j];
				j++;
			}
			k++;
		}
		//copy if any elements are remaining
		while(i<n1)
		{
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=rightarray[j];
			j++;
			k++;
		}
		
	}
	public static void mergesort(int arr[],int left,int right)
	{
		
		if(left<right)
		{
			int middle=(left+right)/2;
			mergesort(arr,left,middle);
			mergesort(arr,middle+1,right);
			merge(arr,left,middle,right);
		}
		
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
		mergesort(arr,0,arr.length-1);
		print(arr);
	}

}
