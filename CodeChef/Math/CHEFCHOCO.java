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
		    int c = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    // c = no of choco
		    // x = no of choco with him already
		    // y = cost of 1 choco
		    // min money req so he can give c choco
		    // (c-x) = no of choco needed
		    // no of choco * price of 1 choco = amount of money he needs to spent
		    System.out.println((c-x) * y);
		}
	}
}
