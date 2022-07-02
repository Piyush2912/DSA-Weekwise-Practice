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
		while(n-- > 0){
		    int h = sc.nextInt();
		    float c = sc.nextFloat();
		    int t = sc.nextInt();
		    
		    boolean c1 = (h > 50 ? true: false);
		    boolean c2 = (c < 0.7 ? true: false);
		    boolean c3 = (t > 5600 ? true: false);
		    
		    if(c1 == true && c2 == true && c3 == true){
		        System.out.println(10);
		    }else if(c1 == true && c2 == true){
		        System.out.println(9);
		    }else if(c2 == true && c3 == true){
		        System.out.println(8);
		    }else if(c1 == true && c3 == true){
		        System.out.println(7);
		    }else if(c1 == true || c2 == true || c3 == true){
		        System.out.println(6);
		    }else if(c1 == false && c2 == false && c3 == false){
		        System.out.println(5);
		    }
		}
	}
}
