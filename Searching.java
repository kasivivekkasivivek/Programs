package matrix;
import java.util.*;
public class Searching {
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
	public static void  linearsearch(int arr[])
	{
		//taking the input to search for the element
		System.out.println("Enter the element to search");
		int key=ss.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element is at the position   :"+(i+1)); //since for users 0 index is 1
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Element is not present in the array");
		}
	}
	/*
	         The time complexity of the above algorithm is O(n).
	*/
//-------------------------------------------------------------------------------------------------------------------------------------------	
	//----------------improve the performance of linear search----------------
	/*
	         Improve Linear Search Worst-Case Complexity

			1)	if element Found at last ----> 	 O(n) to O(1)
			2)	if element Not found     ---->   O(n) to O(n/2)
	 */
	
	public static void linearsearch2(int arr[])
	{
		System.out.println("Enter the element to search");
		int key=ss.nextInt();
		int left=0;
		int right=arr.length-1;
		int position=-1;
		while(left<=right)
		{
			if(arr[left]==key)
			{
				position=left;
				System.out.println("Element is found at position :"+(position+1));
				break;
			}
			if(arr[right]==key)
			{
				position=right;
				System.out.println("Element is found at position :"+(position+1));
				break;
			}
			left++;
			right--;
		}
		if(position==-1)
		{
			System.out.println("Element is not present in the array");
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
		linearsearch(arr);
		linearsearch2(arr);
	}

}
