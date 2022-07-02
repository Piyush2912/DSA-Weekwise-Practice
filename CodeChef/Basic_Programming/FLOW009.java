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
		    int q = sc.nextInt();
		    int p = sc.nextInt();
		    double amount = 0;
		    if(q <= 1000){
		        amount = p * q;
		    }else{
		        amount = (p * q) - (0.1 * p * q); 
		    }
		    System.out.println(amount);
		}
	}
}
