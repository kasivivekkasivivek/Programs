package matrix;
import java.util.*;
public class Common_elements_in_arrays
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
	//finding common elements between 2 sorted arrays
	public static void common2()
	{
		System.out.println("Enter the size of array");
		int a=ss.nextInt();
		System.out.println("Enter the elements if the array");
		int arr1[]=new int[a];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=ss.nextInt();
		}
		print(arr1);
		System.out.println("Enter the size of array");
		int b=ss.nextInt();
		System.out.println("Enter the elements if the array");
		int arr2[]=new int[b];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=ss.nextInt();
		}
		print(arr2);
		//sorting the elements of the array
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		//printing the elements
			print(arr1);
			print(arr2);
			//coding for finding common elements in 2 arrays
		int i=0,j=0;
		int count=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.print(arr1[i]+" ");
			i++;
			j++;
			count++;
			}
			else if(arr1[i]<arr2[j])
				i++;
			else 
				j++;
		}
		System.out.println();
		if(count==0)
		{
			System.out.println("There are no common elements");
		}
	}
	//finding common elements between 3 sorted arrays
	public static void common3()
	{
		//taking the input for 3 arrays
		System.out.println("Enter the size of array");
		int a=ss.nextInt();
		System.out.println("Enter the elements if the array");
		int arr1[]=new int[a];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=ss.nextInt();
		}
		print(arr1);
		System.out.println("Enter the size of array");
		int b=ss.nextInt();
		System.out.println("Enter the elements if the array");
		int arr2[]=new int[b];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=ss.nextInt();
		}
		print(arr2);
		System.out.println("Enter the size of array");
		int c=ss.nextInt();
		System.out.println("Enter the elements if the array");
		int arr3[]=new int[c];
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=ss.nextInt();
		}
		print(arr3);
		//sorting the 3 arrays
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		Arrays.parallelSort(arr3);
		//printing the elements
		print(arr1);
		print(arr2);
		print(arr3);
		//coding for finding common elements in 3 arrays
		System.out.println("Commmon elements from  the 3 arrays are :");
		int i=0,j=0,k=0;
		int count=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
			{
				System.out.print(arr1[i]+" ");
				count++;
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr2[j]<arr3[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
		if(count==0)
		{
			System.out.println("There are no common elements in the array");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*int n1=ss.nextInt();
		int arr[]=new int[n1];
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=ss.nextInt();
		}*/
		//print(arr);
		common2();
		common3();
	}

}
