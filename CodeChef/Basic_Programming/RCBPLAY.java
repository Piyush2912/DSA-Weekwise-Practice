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
	int t =sc.nextInt();
	while(t-- > 0){
	    int x = sc.nextInt(); // points earned so far
	    int y = sc.nextInt(); // at least total y points
	    int z = sc.nextInt(); // no of games left to play
	    // condition +2 point for win and 1 point for draw and no point for loss
	    int ans = 0;
	    if (x >= y){
	        ans = 1;
	    }
	    else if (x + z >= y){
	        ans = 1;
	    }
	    else if (x + z*2 >= y){
	        ans = 1;
	    }else{
	        ans = -1;
	    }
	    
	    if(ans ==-1){
	        System.out.println("NO");
	    }else{
	        
	        System.out.println("YES");
	    }
	    
	}
	    
	}
	
}
