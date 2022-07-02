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
	    int t =sc.nextInt();
	    while(t-- > 0){
	        float s = sc.nextFloat();
	        if(s < 1500){
    	        float hra = (float)(0.1 * s);
    	        float da = (float)(0.9 * s);
    	        System.out.println((float)(s + hra + da));
    	   }else {
    	        System.out.println((float)(s + 500 + (float)(0.98*s)));
    	       
    	   }
    	   
	            
	        }
	    
	}
}
