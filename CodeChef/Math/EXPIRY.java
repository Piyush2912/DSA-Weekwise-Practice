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
		// n = no of breads she have
		// m = no of days after which they will expire
		// k = no of breads she can consume in 1 day
		// can she eat all the breads before they expire
		// k * m = no of breads she can eat in days before it expires
		// if (k * m < n) -> she can't
		// otherwise -> she can
		
		Scanner sc =  new Scanner(System.in);
		int t  =sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    if( (k*m) < n){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}
	}
}
