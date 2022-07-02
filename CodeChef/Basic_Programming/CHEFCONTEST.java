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
		    int p = sc.nextInt();
		    int q = sc.nextInt();
		    int bp_x = x + p*10;
		    int bp_y = y + q*10;
		    if(bp_x < bp_y){
		        System.out.println("Chef");
		    }else if(bp_x > bp_y){
		        System.out.println("Chefina");
		    }else{
		        System.out.println("Draw");
		    }
		}
	}
}
