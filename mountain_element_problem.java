package matrix;
import java.util.*;
/*
		 An array A with N elements is called a mountain if there is an index 'i' such that,
		A[0] < A[1] < A[2] < ... < A[i], and
		A[i] > A[i+1] > A[i+2] > ... > A[N-1]
		Here, the element at index 
		i
		 is called the peak element of the mountain.
		
		Given an array A of N integers, A forms a mountain, write a program to find the index of peak element
		 */
public class mountain_element_problem {
	public static void mountain_element(int arr[])
	{
		//applying the concept of binatry search
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{
			int mid=(low+high)/2;
			if(arr[mid]<arr[mid+1])
			{
				low=mid+1;
			}
			else
			{
				high=mid;
			}
		}
		System.out.println(low);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
				arr[i]=ss.nextInt();
		}
		mountain_element(arr);
		
		
	}

}
