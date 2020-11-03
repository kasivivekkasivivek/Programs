package matrix;
import java.util.*;

public class reverse_array {
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
	
	 public static void reverse(int arr[])
	    {
	        int left=0;
	        int right=arr.length-1;
	        while(left<right)
	        {
	            int temp=arr[left];
	            arr[left]=arr[right];
	            arr[right]=temp;
	            left++;
	            right--;
	        }
	        print(arr);
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
		reverse(arr);
		
		
	}

}

