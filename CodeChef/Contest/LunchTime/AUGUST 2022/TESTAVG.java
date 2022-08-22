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
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    if((A + B)/2 < 35 || (A+C)/2 < 35 || (B+C)/2 < 35){
		        System.out.println("Fail");
		    }else{
		        System.out.println("Pass");
		    }
		}
		
	}
}
