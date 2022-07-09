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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int l = sc.nextInt();
		    int r = sc.nextInt();
	        int p=0;
		  for(int i=l;i<=r;i++)
		  {
		      if(i%10==2||i%10==3||i%10==9){
		          p=p+1;
		      }
		     
		  
		}
		System.out.println(p);
	}    
}
}
