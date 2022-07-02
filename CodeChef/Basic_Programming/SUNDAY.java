/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		    Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    int[] ss={6,7,13,14,20,21,27,28};
		    int count=0;
		    for(int k=0;k<n;k++)
		    {
		        for(int l=0;l<ss.length;l++)
		        {
		            if(a[k]==ss[l])
		            {
		                count++;
		            }
		           
		            else{
		                //count=0;
		                continue;
		            }
		        }
		    }
		 int rdays=a.length-count;
		 int hdays=ss.length+rdays;
		    System.out.println(hdays);
		}	}
}
