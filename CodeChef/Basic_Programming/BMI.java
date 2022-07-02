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
		    int m = sc.nextInt();
		    int h = sc.nextInt();
		    int r = m/(h*h);
		    if(r <= 18){
		        System.out.println(1);
		    }else if(r >= 19 && r <=24){
		        System.out.println(2);
		    }else if(r >= 25 && r<= 29){
		        System.out.println(3);
		    }else if(r >= 30){
		        System.out.println(4);
		    }
		}
	}
}
