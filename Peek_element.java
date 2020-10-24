package matrix;
import java.util.*;
public class Peek_element
	{
	
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
	/*
	 Input: array[] = {10, 20, 15, 2, 23, 90, 67}
		Output: 20 or 90
		The element 20 has neighbours 10 and 15, 
		both of them are less than 20, similarly 90 has neighbous 23 and 67.
	 */
	public static void peekelement(int arr[])
	{
		if(arr[0]>arr[1])
		{
			System.out.print(arr[0]+",");
		}
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
			{
				System.out.print(arr[i]+",");
			}
		}
		if(arr[arr.length-1]>arr[arr.length-2])
		{
			System.out.print(arr[arr.length-1]);
		}
		System.out.println();
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
		peekelement(arr);
		
	}

}
