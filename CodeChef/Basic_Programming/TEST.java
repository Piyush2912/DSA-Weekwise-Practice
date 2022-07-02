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
		Scanner sc = new Scanner (System.in);
		int ar[] =new int[100];
		for(int i=0; i<100; i++){
		     ar[i] = sc.nextInt();
		    if(ar[i] != 42){
		       
		        System.out.println(ar[i]);
		    }else{
		        break;
		    }
		}
	}
}
