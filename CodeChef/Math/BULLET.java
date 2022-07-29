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
		Scanner sc =new Scanner(System.in);
		/*
		
		x pixel per frame
		y pixel away
		z sec
		*/
		int t = sc.nextInt();
		while(t-- > 0){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    
		    int res = Z - (Y/X);
		    if(res > 0){
		        System.out.println(res);
		    }else{
		        System.out.println(0);
		    }
		}
		
	}
}
