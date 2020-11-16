package matrix;
import java.util.*;


public class print_all_Subarrays{
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
	
	//printing all the subarrays-->Time complexity is O(n^3)
		public static void subarray2(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i;j<arr.length;j++)
				{
					System.out.print("[");
					for(int k=i;k<j;k++)
					{
						System.out.print(arr[k]+",");
					}
					System.out.print(arr[j]+"] ");
				}
				
			}
		}
		
		
	//time complexity of the array is O(n^2)
	public static void subarray(int arr[],int l,int r)
	{
		if(r==arr.length)
		{
			return;
		}
		else if(l>r)
		{
			subarray(arr,0,r+1);
		}
		else 
		{
			System.out.print("[");
		for(int i=l;i<r;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[r]+"]");
		subarray(arr,l+1,r);
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
		subarray(arr,0,0);
		System.out.println("\n \n");
		subarray2(arr);
		
		
}
}


