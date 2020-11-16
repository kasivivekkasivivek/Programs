package matrix;
import java.util.*;


public class MIn_Max_k_Subarray{
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
	//here the time complexity is O(n*k)-->if k is low it is good approach but what if k=n/2 ?
	public static void maxsum(int arr[])
	{
		System.out.println("Enter the value of K");
		int k=ss.nextInt();
		int max=0;
		for(int i=0;i<arr.length-k+1;i++)
		{
			int sum=0;
			for(int j=i;j<k+i;j++)
			{
				sum=sum+arr[j];
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		if(k>arr.length)
		{
			System.out.println("Invalid");
		}
		else
		{
		System.out.println(max);
		}
	}
	
	//using sliding window approach max of subarray --> the time complexity of the algoritham is O(n)
	public static void maxsum2(int arr[])
	{
		System.out.println("Enter the value of K");
		int k=ss.nextInt();	
		int max=0;			//for max value
		int cur=0;			//for current value
		//to set the first max value
		for(int i=0;i<k;i++)
		{
			cur=cur+arr[i];
		}
		max=cur;
		for(int i=k;i<arr.length;i++)
		{
			cur=cur+arr[i]-arr[i-k];
			max=Math.max(cur,max);
		}
		System.out.println(max);
		
	}
	
	//using sliding window approach min of subarray --> the time complexity of the algoritham is O(n)
	public static void minsum(int arr[])
	{
		System.out.println("Enter the value of K");
		int k=ss.nextInt();	
		int min=Integer.MAX_VALUE;			//for max value
		int cur=0;			//for current value
		//to set the first max value
		for(int i=0;i<k;i++)
		{
			cur=cur+arr[i];
		}
		min=cur;
		for(int i=k;i<arr.length;i++)
		{
			cur=cur+arr[i]-arr[i-k];
			min=Math.min(cur,min);
		}
		System.out.println(min);
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
		maxsum(arr);
		maxsum2(arr);
		minsum(arr);
		
		
}
}


