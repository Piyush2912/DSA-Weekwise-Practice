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
		*/
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    if(M < N && (N%M==0) && (N/M)%2==0 ){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
