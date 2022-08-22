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
		X = amount of item
		if x <= 100
        if x > 100 && x <= 1000 => discount 25
        if x > 1000 && x <= 5000 => discount 100
        if x > 5000 => discount 500
        to find final amount
        
        15 ->  => 15
        70 -> 70
        250 -> 250 - 25 = 225
        1000 -> 1000 - 25 = 975
        
		*/
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int costOfItem = sc.nextInt();
		    if (costOfItem <= 100){
		        System.out.println(costOfItem);
		    }else if(costOfItem > 100 && costOfItem <= 1000){
		        System.out.println(costOfItem - 25);
		    }else if(costOfItem > 1000 && costOfItem <= 5000){
		        System.out.println(costOfItem - 100);
		    }else if(costOfItem > 5000){
		        System.out.println(costOfItem - 500);
		    }
		}
	}
}
