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
		int testcase = sc.nextInt();
		while(testcase-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(k == 0){
		        System.out.println( (x < y) ? n*x : n*y);
		    }else{
		        int amount = k * x;
		        if(x < y){
		            amount += (n-k) * x;
		        }else{
		            amount += (n-k) * y;
		        }
		        System.out.println(amount);
		    }
		}
	}
}
