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
		    int dist = sc.nextInt();
		    if(dist <= 300){
		        System.out.println(3000);
		    }else{
		        System.out.println(dist * 10);
		    }
		}
	}
}
