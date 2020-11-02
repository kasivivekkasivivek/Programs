package matrix;
import java.util.*;

public class right_rotate_1 {
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
	//------------------using normal algotritham------------------
	
			public static void right_rotate_array(int arr[])
			{
				int temp=arr[arr.length-1];
				for(int i=arr.length-2;i>=0;i--)
				{
					arr[i+1]=arr[i];
				}
				arr[0]=temp;
			}
			public static void right_rotate_array_ktimes(int arr[],int k)
			{
				
				for(int i=0;i<k;i++)
				{
					right_rotate_array(arr);
				}
				print(arr);
			}
			
			
		//using revrsing k=k%arr.length(imp)	
	
	public static void reverse(int arr[], int left, int right)
	{
		
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
	}
	
	public static void right_rotate_array_ktimes1(int arr[], int k)
	{
		k=k%arr.length;   // important ***********************
		reverse(arr,0,arr.length-1);
		
		reverse(arr,0,k-1);
		
		reverse(arr,k,arr.length-1);
		print(arr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=ss.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ss.nextInt();
		}
		
		print(arr);
		int k=ss.nextInt();
		right_rotate_array_ktimes1(arr,k);
		
	}

}

