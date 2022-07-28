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
		int testcase = sc.nextInt();
		while(testcase-- > 0){
		    int min_a_b = sc.nextInt();
		    int min_b_c = sc.nextInt();
		    int min_c_a = sc.nextInt();
		    
		    if(min_b_c == min_c_a && min_c_a == min_a_b){
		        //case 1: all are equal
		        System.out.println("YES");
		    }else if(min_a_b == min_b_c || min_a_b == min_c_a || min_b_c == min_c_a){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
