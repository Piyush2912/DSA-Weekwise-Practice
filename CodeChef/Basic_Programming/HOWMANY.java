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
		int n = sc.nextInt();
		int count = 0;
		while(n>0){
		    int rem = n%10;
		    count++;
		    n = n/10;
		}
		if(count == 1){
		    System.out.println(1);
		}else if(count == 2){
		    System.out.println(2);
		}else if(count == 3){
		    System.out.println(3);
		}else{
		    System.out.println("More than 3 digits");
		}
		
	}
}
