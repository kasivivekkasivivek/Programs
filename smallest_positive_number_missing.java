package matrix;
import java.util.*;
public class smallest_positive_number_missing 
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
	//move all the positive elements to left and non positive and 0 to right
	public static void seperate(int arr[])
	{
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			if(arr[left]<=0)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				right--;
			}
			else
			{
				left++;
			}
		}
		print(arr);
	}
	
	public static void finding1(int arr[])
	{
		Arrays.parallelSort(arr);
		int x=arr[arr.length-1];
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(Arrays.binarySearch(arr, i)<0)
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
