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
		int textcase = sc.nextInt();
		while(textcase-- > 0){
		    int noofpassreq = sc.nextInt();
		    int noofpasshehas = sc.nextInt();
		    System.out.println((noofpasshehas > noofpassreq) ?  "YES" : "NO");
		}
	}
}
