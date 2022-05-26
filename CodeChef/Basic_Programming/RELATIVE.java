/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while (test_case-- > 0){
            // inputs
            int g_value = sc.nextInt();
            int c_value = sc.nextInt();
            // logic
            int result = c_value*c_value/(2*g_value);
            // output
            System.out.println(result);
        }
    
	}
}
