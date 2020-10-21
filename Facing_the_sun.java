package matrix;
import java.util.*;
public class Facing_the_sun
	{
	/*		N = 5
			H[] = {7, 4, 8, 2, 9}
			Output: 3
			Explanation: As 7 is the first element, it
			can see the sunrise. 4 can't see the
			sunrise as 7 is hiding it.  8 can see.
			2 can't see the sunrise. 9 also can see
			the sunrise.
	*/
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
	
	public static void countbuildings(int arr[])
	{
		 int max=arr[0];
	        int count=1;
	        for(int i=1;i<arr.length;i++)
	        {
	            if(arr[i]>max)
	            {
	                count++;
	                max=arr[i];
	            }
	        }
	        System.out.println(count);
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
		countbuildings(arr);
	}

}
