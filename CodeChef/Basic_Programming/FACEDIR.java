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
	        // 0 -> North
	        // 1 -> East
	        // 2 -> South
	        // 3 -> West
	        // 4/4 = 0 North
	        // 5/4 = 1 East
	        // 6/4 = 2 South
	        // 7/4 = 3 = West
	        // 8/4 = 0 = North
	        int n =sc.nextInt();
	        if(n%4 == 0){
	            System.out.println("North");
	        }else if(n%4 == 1){
	            System.out.println("East");
	        }else if(n%4 == 2){
	            System.out.println("South");
	        }else if(n%4 == 3){
	            System.out.println("West");
	        }
	    }
	    
	}
}
