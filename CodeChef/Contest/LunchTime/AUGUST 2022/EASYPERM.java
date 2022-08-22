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
		LCM (1 + 2 , 2 + 1) = LCM(3,3) = 3
		LCM (1 + A1, 2 + A2)= LCM()= 
		4
		LCM (1 + 4, 2 + 3, 3 + 2, 4 + 1) = LCM(5,6) = 30
		*/
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int N = sc.nextInt();
		    int temp = N;
		    while(temp/2 > 0){
		        System.out.print(temp + " ");
		        temp--;
		    }
		    System.out.println(1);
		}
		
	}
}
