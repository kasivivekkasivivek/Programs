package matrix;
import java.util.*;
public class k_closest_element {
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
	 As the array A is sorted, the K closest elements always exist as a subarray of size K.

Consider mid and mid + K as the start index and the end index of our window of size K+1.
 We take K+1 as size because the K+1th element is used to decide whether to shrink the search range 
 towards left or right.

Case 1: Assume X is less than A[mid]. Then, we move the window to the left by moving high to mid.

			----X------A[mid]-----------------------A[mid+K]-----------
			Move high to mid.

Case 2: Assume X is greater than A[mid+K]. Then, we move the window to the right by moving low to mid+1.

			-----------A[mid]-----------------------A[mid+K]------X----
			Move low to mid+1.

Case 3: Assume X is somewhere between A[mid] and A[mid + K]. Then, we have to minimize the difference between X - A[mid] and A[mid+K]-X. 
So if (A[mid+K]+A[mid])/2 is less than X, we move low to mid+1, otherwise, we move high to mid.

			-----------A[mid]---------------X------A[mid+K]-----------
			Move low to mid+1.
			
			-----------A[mid]------X----------------A[mid+K]-----------
			Move high to mid.

In the end, low will be the starting index of the subarray with K closest elements. 
	 */
	/*
	 *Input: K = 4, X = 35
       arr[] = {12, 16, 22, 30, 35, 39, 42, 
               45, 48, 50, 53, 55, 56}
		Output: 30 39 42 45
	 */
	 public static void k_closest(int arr[],int k,int key)
	    {
	        int l=0;
	        int h=arr.length-k;
	        while(l<h){
	            int mid=(l+h)/2;
	            if(key>=arr[mid+k])
	            {
	                l=mid+1;
	            }
	            else if(key<arr[mid])
	            {
	                h=mid;
	            }
	            else if((arr[mid]+arr[mid+k])/2<key)
	            {
	                l=mid+1;
	            }
	            else{
	                h=mid;
	            }
	            
	        }
	        for(int i=l;i<l+k;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	    }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int n=ss.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=ss.nextInt();
			}
			Arrays.parallelSort(arr);
			print(arr);
			System.out.println("Enter the key");
			int key=ss.nextInt();
			System.out.println("Enter k");
			int k=ss.nextInt();
			//System.out.println(crossoverpoint(arr,0,arr.length-1,key));
			
			k_closest(arr,k,key);
	 }
}
