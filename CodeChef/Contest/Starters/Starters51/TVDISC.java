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
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();
	        if( (x1 - x2) < (y1 - y2)){
	            System.out.println("First");
	        }else if((x1 - x2) > (y1 - y2)){
	            System.out.println("Second");
	        }else{
	            System.out.println("Any");
	        }
	    }
	}
}
