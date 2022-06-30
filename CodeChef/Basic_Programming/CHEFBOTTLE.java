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
		// case 1: if(x < k) -> if(n*x > k) -> k/x
		 //     n x k
		 //     5 2 8
		 //     op 4 => 1 1 1 1 1
		 //             2 2 2 2 2   8
		 // ->          2 2 2 2 0
		 
		 // case 2: if (x > k) - > 0
		 //     10 5 4
		 //     0       ->  1 1 1 1 1 1 1 1 1 1 1
		 //                 5 5 5 5 5 5 5 5 5 5 5   4
		 //                 4/5 0 0 0 0 0 0 0 0 0 0 
		  // case 3: if(x < k ) -> if(n*x < k) -> n
		   //   3 1 4
		   //           1 1 1
		   //           1 1 1       4
		   //           1 1 1 
		   
		   //                       
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            if(x > k){
                System.out.println(0);
            }else{
                if(n*x < k){
                    System.out.println(n);
                }else{
                    System.out.println(k/x);
                }
            }
        }
	}
}
