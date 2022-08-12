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
		// 1 submission every 30 seconds
		// X = time for completetion of contest
		// Exception: last 5 second no submission
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int time_X = sc.nextInt();
		    System.out.println((int)Math.floor((time_X * 60) / 30));
		}
	}
}
