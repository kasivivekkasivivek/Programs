package matrix;
import java.util.*;


public class Pairs_with_given_sum{
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
	
	//array pairs problem using pointer
	public static void pairs1(int arr[])
	{
		System.out.println("Enter the sum");
		int sum=ss.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					count++;
					System.out.println("the pair is :"+arr[i]+","+arr[j]+" at position "+(i+1)+","+(j+1));
					return;	//since I want only one output I a having this
				}
			}
		}
		if(count==0)
		{
			System.out.println("No pair found");
		}
	}
	
	
	
	//using 2 pointer method--> The time complexity here is O(nlog(n))
	public static void pairs3(int arr[])
	{
		Arrays.parallelSort(arr);
		System.out.println("Enter the sum");
		int sum=ss.nextInt();
		int l=0;
		int r=arr.length-1;
		
		int count=0;
		print(arr);
		while(l<r)
		{
			if(arr[l]+arr[r]==sum)
			{
				System.out.println("the pair is :"+arr[l]+","+arr[r]+" at position "+(l+1)+","+(r+1));
				count++;
				l++;
				r--;
			}
			if(arr[l]+arr[r]>sum)
			{
				r--;
			}
			else
			{
				l++;
			}
		}
		if(count==0)
		{
			System.out.println("There are no pairs");
		}
		
	}
	
	//using hashmap--> this has the time complexity of O(n)
	public static void pairs4(int arr[])
	{
		System.out.println("Enter the sum");
		int sum=ss.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < arr.length; i++)
		{
			if (map.containsKey(sum - arr[i]))
			{
				System.out.println("Pair found at index " +
								   map.get(sum - arr[i]) + " and " + i);
				return;
			}

			// if element is not present add elementt 
			map.put(arr[i], i);
		}

		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=ss.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=rr.nextInt(10);
		}
		print(arr);
		pairs4(arr);
		
		
}
}


