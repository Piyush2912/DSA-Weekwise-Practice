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
		/*
		N = distance that chef needs to travel
		X = the per litre prices of petrol 
		Y = the per litre prices of diesel 
		A = the distance chef can travel using one litre of petrol 
		B = the distance chef can travel using one litre of diesel
		
		20 10 8 2 4
		N  X  Y A B
		
		Pen and Paper is best approach
		
		*/
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    Float N = sc.nextFloat();
		    Float x = sc.nextFloat();
		    Float y = sc.nextFloat();
		    Float a = sc.nextFloat();
		    Float b = sc.nextFloat();
		    if( ((float)(x/a) * N) < ( (float)(y/b) * N  ) ){
		        System.out.println("PETROL");
		    }else if ( ((float)(x/a) * N) > ( (float)(y/b) * N  ) ){
		        System.out.println("DIESEL");
		    }else{
		        System.out.println("ANY");
		    }
		    
		    
		}
	}
}
