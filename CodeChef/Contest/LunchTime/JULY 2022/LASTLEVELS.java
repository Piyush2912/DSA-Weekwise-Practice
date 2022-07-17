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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    if(x <= 3){
		        System.out.println(x*y);
		    }else{
		        // here comes the hard part
		        
		      //  x=7 y=20 z=8
		      //            3*20*2 +       8*2     +    1 * 20 = 120 + 16 + 20 = 156   
		      //    x= 24 y= 45 z = 15
		      //   
		        int res = 0;
		        int quot = x/3;
		        int rem = x % 3;
		        if(x % 3 != 0){
		         res = ( 3*y*quot + z*quot + rem*y );
		        }else{
		            res = ( 3*y*quot + z*(quot-1) + rem*y );
		        }
		        System.out.println(res);
		    }
		}
	}
}
