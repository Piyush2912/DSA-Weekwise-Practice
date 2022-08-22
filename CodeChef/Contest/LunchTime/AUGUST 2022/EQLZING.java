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
		/*
		1 1 -> Y a == b
		1 2 -> N
		1 3 -> odd odd Y
		1 4 -> odd even N
		1 5 -> Y
		2 2 -> Y
		2 4 -> even even Y
		4 1 -> even odd N
		1 2 -> a - b == 1 => N
		
		*/
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    // case 1: All no cases -> if diff is 1, even odd, odd even
		    if( (Math.abs(A-B) == 1) || (A%2==0 && B%2!=0) || (A%2!=0 && B%2==0)){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}
	}
}
