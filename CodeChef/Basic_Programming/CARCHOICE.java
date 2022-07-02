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
		Scanner sc= new Scanner(System.in);
		int t =sc.nextInt();
		while(t-- > 0){
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int y2 = sc.nextInt();
		    float car1 = (float)y1/x1;
		    float car2 = (float)y2/x2;
		    if(car1 < car2){
		        System.out.println(-1);
		    }else if(car1 > car2){
		        System.out.println(1);
		    }else{
		        System.out.println(0);
		    }
		    
		}
	}
}
