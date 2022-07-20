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
		    int rows = sc.nextInt();
		    int columns = sc.nextInt();
		    // case : 
		    if(rows%2 ==0 && columns%2 == 0){
		        System.out.println(0);
		    }
		    // n odds and m even
		        
		    else if(rows % 2 != 0 && columns%2 == 0){
		            System.out.println((rows % 2)* columns);
		        }
		        // n even and m odd
		    else if(columns % 2 != 0 && rows%2 == 0){
		            System.out.println((columns%2)* rows);
		     }
		     else{
		            // both are odd
		            System.out.println(rows + columns - 1);
		       }
		    
		}
	}
}
