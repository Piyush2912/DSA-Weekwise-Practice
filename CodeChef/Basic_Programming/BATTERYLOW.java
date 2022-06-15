/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		while(n-- > 0){
		    int x = sc.nextInt();
		    if(x <= 15)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
