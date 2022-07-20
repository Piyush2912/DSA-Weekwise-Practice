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
	    int testcase = sc.nextInt();
	    while(testcase-- > 0){
	        int noofcandies = sc.nextInt();
	        int noofpockets = sc.nextInt();
	        int noofcandiesitcanhold = sc.nextInt();
	        
	        /*
	        n k m
	        4
            6 2 3
            1
            3 1 2
            2
            3/2 = 1
            8 4 1
            8/4 = 2
            25 4 2 = 8
            25%8 = 3 + 1 = 4
        
	        */
	       if(noofcandies < (noofcandiesitcanhold*noofpockets)){
	           System.out.println(1);
	       }else{
	           if(noofcandies%(noofcandiesitcanhold*noofpockets) > 0 ){
	               System.out.println((noofcandies/(noofcandiesitcanhold*noofpockets)) + 1);
	           }else{
	               System.out.println( (noofcandies/(noofcandiesitcanhold*noofpockets)) );
	           }
	       }
	    }
	    
	}
}
