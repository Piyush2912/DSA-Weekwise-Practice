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
		    int w = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    if( (x == w) || (y == w) || (z == w) || ((x + y) == w) || ((x+z) == w) || ((y+z) == w) || ((x + y + z) == w) ){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
