package matrix;
import java.util.*;


public class Minimum_Length_Subarray_Sum_atleast_K{
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
	
	/*
	 In the Sample Input 1, there are many subarrays with a sum greater than 9.
	  But the subarrays with sum equal to 9 are {5, 3, 1}, {2, 4, 3}, and {3, 6}.
	  As the subarray {3, 6} has minimum length; the output is 2.
	 */
	
	/*
	 Minimum Length Subarray with Sum at least K
Given an array A of N integers, and an integer K,
 write a program to find the length of minimum length subarray whose sum is greater
  than or equal to K
	 */
	public static int fun(int arr[])
	{
		System.out.println("Enter the minimum sum");
		int key=ss.nextInt();
	    int count=0;
	    int min_len=arr.length+1;
	    for(int i=0;i<arr.length;i++)
	    {
	        int cur=arr[i];
	        if(cur>=key)
	        {
	            count++;
	            return 1;
	        }
	        for(int j=i+1;j<arr.length;j++)
	        {
	            cur=cur+arr[j];
	            if(cur>=key && (j-i+1)<min_len)
	            {
	                min_len=(j-i+1);
	                count++;
	            }
	        }
	    }
	    if(count==0)
	    {
	        return 0;
	    }
	    else{
	    return min_len;
	    }
	}
	
	//time complexity of O(n)
	 public static int fun(int arr[],int key)
		{
		    int ans=Integer.MAX_VALUE;
		    int l=0;
		    int sum=0;
		    for(int i=0;i<arr.length;i++)
		    {
		        sum=sum+arr[i];
		        while(sum>=key)
		        {
		           ans=Math.min(ans,i+1-l);
		           sum=sum-arr[l];
		           l++;
		        }
		    }
		    if(ans!=Integer.MAX_VALUE)
		    {
		        return ans;
		    }
		    else{
		        return 0;
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
		
		
		
}
}


