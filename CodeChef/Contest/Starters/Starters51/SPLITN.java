/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     public static long BKAlorithm(long n)
    {
        long count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return (long)count;
    }
 
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    long x = sc.nextLong();
		    System.out.println(BKAlorithm(x) - 1);
		}
	}
	
}
