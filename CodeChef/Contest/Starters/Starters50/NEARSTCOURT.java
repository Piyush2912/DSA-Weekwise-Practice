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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int v = (Math.abs(x - y))/2;
		    int z = 0;
		    if(x <= y){
		        z = x + v;
		    }else{
		        z = y + v;
		    } 
		    System.out.println(Math.max(Math.abs(x - z), Math.abs(y - z) ) );
		}
	}
}
