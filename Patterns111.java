package matrix;
import java.util.*;
public class Patterns111 {
	/*
	    * 
		* * 
		* * * 
		* * * * 
		* * * * * 
	 */
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	/*
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
	
	 */
	public static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	/*
	        *
		   **
		  ***
		 ****
		*****
	 
	 */
	public static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");//putting space after * makes it above pattern(pattern 2)
			}
			System.out.println();
		}
	}
// ----------------------------reversing the above--------------------------------
	/*
	    * * * * * 
		* * * * 
		* * * 
		* * 
		* 
	 */
	public static void pattern4(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	/*
		*****
		 ****
		  ***
		   **
		    *
	 */
	public static void pattern5(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");//putting space after * makes it pattern 6
			}
			System.out.println();
		}
	}
	/*
			* * * * * 
			 * * * * 
			  * * * 
			   * * 
			    * 
	 */
	public static void pattern6(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	/*
							 	* 
							   * * 
							  * * * 
							 * * * * 
							* * * * * 
							 * * * * 
							  * * * 
							   * * 
							    * 
							 	 
	 */
	public static void pattern7(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>1;i--)
		{
			for(int j=i-1;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//other way but should make small changes to make it better
	/*
							    * 
							   * * 
							  * * * 
							 * * * * 
							* * * * * 
							* * * * * 
							 * * * * 
							  * * * 
							   * * 
							    * 
	 */
	public static void pattern7_1(int n)
	{
		pattern2(n);
		pattern6(n);
	}
	//better version of pattern2 which will be a perfect triangle 
	//-------------------------important----|| (2*i)-1 ||---------------------------
	/* 
									*
								   ***
								  *****
								 *******
								*********
	 
	 */
	public static void pattern8(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
						*********
						 *******
						  *****
						   ***
						    *
	 */
	public static void pattern9(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/* 
							* * * * * 
							 * * * * 
							  * * * 
							   * * 
							    * 
							    * 
							   * * 
							  * * * 
							 * * * * 
							* * * * * 
	 */
	public static void pattern10(int n)
	{
		pattern6(n);
		pattern2(n);
	}
	/*
						    *
							**
							* *
							*  *
							*****
	 
	 */
	public static void pattern11(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i ||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
					        *
						   **
						  * *
						 *  *
						*****
	 
	 */
	public static void pattern12(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 ||j==i||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
						    *****
							*  *
							* *
							**
							*
	 */
	public static void pattern13(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(j==0||j==i-1||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	/*
						    *****
							 *  * 
							  * *  
							   **   
							    *    
	 
	 */
	public static void pattern14(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==i-1||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
	//--------------------important-------------------------
	/*
							    *
							   * *
							  *   *
							 *     *
							*********
	 
	 */
	public static void pattern15(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)              //check its important
			{
				if(j==1 || j==(2*i)-1||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//--------------important---------------
	/*
						    *********
							 *     *
							  *   *
							   * *
							    *
	 
	 */
	public static void pattern16(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1  || j==(2*i)-1 || i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/* 
								    *
								   * *
								  *   *
								 *     *
								*       *
								 *     *
								  *   *
								   * *
								    *
	 */
	public static void pattern17(int n)		
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1 || j==(2*i)-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//reverse
		for(int i=n-1;i>0;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1 || j==(2*i)-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
	   
						    *
							**
							* *
							*  *
							*   *
							*  *
							* *
							**
							*
	 */
	public static void pattern18(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//reverse
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
									    *
									   **
									  * *
									 *  *
									*   *
									 *  *
									  * *
									   **
									    *
	 */
	public static void pattern19(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//reverse
		for(int i=n-1;i>0;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//------------square---------------
	/*
						* * * * * 
						*       * 
						*       * 
						*       * 
						* * * * * 
	 */
	public static void pattern20(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n || i==1 || i==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  "); //double space
				}
			}
			System.out.println();
		}
	}
	/*
						        *****
							   *****
							  *****
							 *****
							*****
	 */
	public static void pattern21(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 *****
							 *****
							  *****
							   *****
							    *****
	 */
	public static void pattern22(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
						/*
						        *****
							   *   *
							  *   *
							 *   *
							*****
	 */
	public static void pattern23(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n ||i==1 ||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
						*****
						 *   *
						  *   *
						   *   *
						    *****
	 */
	public static void pattern24(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n || i==1  || i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//-----------------------important----------------------
	/*
						    *        *   ---------->8
							**      **   ---------->6
							***    ***   ---------->4
							****  ****   ---------->2
							**********
	 */
	public static void pattern25(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=2*i;j<=(2*n)-1;j++)   //important point **
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	//------------------important-------------------
	/*
								**********
								****  ****
								***    ***
								**      **
								*        *
	 
	 */
	public static void pattern26(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=(2*i);j<=(2*n)-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
								    *      *
									**    **
									***  ***
									********
									********
									***  ***
									**    **
							        *      *
	 */
	public static void pattern25_26(int n)
	{
		pattern25(n);
		pattern26(n);
	}
	 /*
							    1 
								1 2 
								1 2 3 
								1 2 3 4 
								1 2 3 4 5 
	  */
	public static void pattern27(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	/*
							    1 
								2 3 
								4 5 6 
								7 8 9 10 
								11 12 13 14 15 
	 */
	public static void pattern28(int n)
	{
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	/*
								    1
								   212
								  32123
								 4321234
								543212345
								 4321234
								  32123
								   212
								    1

	 */
	public static void pattern29(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		//reverse
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	//----heart-(Preferred for even numbers)--------
	/*
	 			//n==6
						  *     *
						 ***   ***
						***** *****
						***********
						 *********
						  *******
						   *****
						    ***
						     *
	 */
	public static void pattern30(int n)
	{
		//section1
				//for evern
				int k=n;
				for(int i=1;i<=n/2;i++)
				{
					for(int j=n/2;j>i;j--)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=(2*i)-1;j++)
					{
						System.out.print("*");
					}
					for(int j=k;j>1;j--)
					{
						System.out.print(" ");
					}
					k=k-2;
					for(int j=1;j<=(2*i)-1;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
		
		
		//section2
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//prefer pattern32
	/*
						      *  *    *  *
							 *    *  *    *
							*      **      *
							*              *
							 *            *
							  *          *
							   *        *
							    *      *
							     *    *
							      *  *
							       **
	 */
	public static void pattern31(int n)
	{
		
		 int i, j;
		    for (i = n/2; i <= n; i = i+2)
		    {
		    for (j = 1; j < n-i; j = j+2)
		        System.out.print(" ");
		     for (j = 1; j <= i; j++)
		       if(j==1 || j==i)
		        System.out.print("*");
		       else
		        System.out.print(" ");
		        for (j = 1; j <= n-i; j++)
		         System.out.print(" ");
		        for (j = 1; j <= i; j++)
		        if(j==1 || j==i)
		            System.out.print("*");
		            else
		            System.out.print(" ");
		            System.out.println();
		      }
		   //-----------
		    for (i = n; i >= 0; i--)
		    {
		    for (j = i; j < n; j++)
		       System.out.print(" ");
		       for (j = 1; j <= ((i * 2) - 1); j++){
		        if(j==1 )
		           System.out.print("*");
		        else
		            System.out.print(" ");
		       }
		        for (j = ((i * 2)-1); j >=1 ; j--){
		        if(j==1 || j==(i*2))
		            System.out.print("*");
		        else
		            System.out.print("");
		        }
		        System.out.println();
		 }
		
		
	}
	/*
										 
										   *       *
										  * *     * *
										 *   *   *   *
										*     * *     *
										*             *
										 *           *
										  *         *
										   *       *
										    *     *
										     *   *
										      * *
										       *
	 */
	//modification of pattern30 for hallow heart symbol 
	public static void pattern32(int n)
	{
		//session1
		int k=n;
		for(int i=1;i<=n/2;i++)
		{
			for(int j=n/2;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1 || j==(2*i)-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=k;j>1;j--)
			{
				System.out.print(" ");
			}
			k=k-2;
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1 || j==(2*i)-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//section2
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1 || j==(2*i)-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//----------------pascal's Triangle---------------------
	//------------------important--------------------
	/*
										  1
									     1 1
									    1 2 1
									   1 3 3 1
									  1 4 6 4 1
									 1 5 10 10 5 1
	 */
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		
		return f;
	}
	public static int ncr(int i,int j)
	{
		return fact(i)/(fact(i-j)*fact(j));			//important
	}
	public static void pattern33(int n)
	{
		
		for(int i=0;i<=n;i++)
		{
			int num=1;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+ncr(i,j));
			}
			System.out.println();
		}
	}
	/*
								1 
								2 2 
								3 3 3 
								4 4 4 4 
								5 5 5 5 5 
								 
	 */
	public static void pattern34(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	/*
								    1 2 3 4 5 
									2 3 4 5 1 
									3 4 5 1 2 
									4 5 1 2 3 
									5 1 2 3 4 
	 */
	//check 
	public static void pattern35(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	//-----------Important--------------
	/*
							    1 
								2 6 
								3 7 10 
								4 8 11 13 
								5 9 12 14 15 
	 */
	public static void pattern36(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int num=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num+n-j;				//important **
			}
			System.out.println();
		}
	}
	/*
									11111
									11122
									11333
									14444
									55555
	 
	 */
	public static void pattern37(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(1);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	/*
	 
									1 2 3 4 5 
									 2 3 4 5 
									  3 4 5 
									   4 5 
									    5 
									   4 5 
									  3 4 5 
									 2 3 4 5 
									1 2 3 4 5 

	 */
	public static void pattern38(int n)
	{
		//upperpart
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
				{
				System.out.print(" ");
				}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//lowerpart
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	/*
	 
							    1 
								1 0 
								1 0 1 
								1 0 1 0 
								1 0 1 0 1 
	 */
	public static void pattern39(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
	}
	/*
							    1 
								2 1 
								3 2 1 
								4 3 2 1 
								5 4 3 2 1
	 */
	public static void pattern40(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	/*
							    1 
								1 2 
								1 2 3 
								1 2 3 4 
								1 2 3 4 5 
								1 2 3 4 
								1 2 3 
								1 2 
								1 
	 */
	public static void pattern41(int n)
	{
		//upperpart
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//lowerpart
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	/*
	 
						1 
						1 2 1 
						1 2 3 2 1 
						1 2 3 4 3 2 1 
						1 2 3 4 5 4 3 2 1 
	 */
	public static void pattern42(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	//----cap.a(A)-->65
	/*
								    A 
									A B 
									A B C 
									A B C D 
									A B C D E 

	 */
	public static void pattern43(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}
	/*
									    A 
										B B 
										C C C 
										D D D D 
										E E E E E 

	 */
	public static void pattern44(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
	}
	/*
							    A B C D E 
								A B C D 
								A B C 
								A B 
								A 
								A B 
								A B C 
								A B C D 
								A B C D E 
	 */
	public static void pattern45(int n)
	{
		//upperpart
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		//lowerpart
		for(int i=1;i<=n-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
	}
	/*
											A 
										   A B 
										  A B C 
										 A B C D 
										A B C D E 
	 */
	public static void pattern46(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}
	/*
								 A
							    B B
							   C   C
							  D     D
							 E       E
							F         F
							 E       E
							  D     D
							   C   C
							    B B
							     A
	 */
	public static void pattern47(int n)
	{
		//upperpart
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1 || j==(2*i)-1)
				{
					System.out.print((char)(64+i));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//lowerpart
		for(int i=n-1;i>0;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1 || j==(2*i)-1)
				{
					System.out.print((char)(64+i));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		pattern47(n);
		
		
	}

}
