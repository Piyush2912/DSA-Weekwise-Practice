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
	    int a[] = new int[3];
	    int b[] = new int[3];
	    int c = 0;
	    int g =0;
	    for(int i=0;i<3;i++){
	        a[i] = sc.nextInt();
	        if(a[i] == 1){
	            c++;   
	        }
	    }
	    for(int i=0;i<3;i++){
	        b[i] = sc.nextInt();
	        if(b[i] == 1){
	            g++;
	        }
	    }
	    if(c == g ){
	        System.out.println("Pass");
	    }else{
	        System.out.println("Fail");
	    }
	}
	    
	}
}
