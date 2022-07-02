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
		    char p1 = sc.next().charAt(0);
		    char p2 = sc.next().charAt(0);
		    char p3 = sc.next().charAt(0);
		    char c1 = sc.next().charAt(0);
		    char c2 = sc.next().charAt(0);
		    
		    if(p1 == c1 || p1 == c2){
		        System.out.println(p1);
		    }else if(p2  == c1 || p2 == c2){
		        System.out.println(p2);
		    }else{
		        System.out.println(p3);
		    }
		}
	}
}
