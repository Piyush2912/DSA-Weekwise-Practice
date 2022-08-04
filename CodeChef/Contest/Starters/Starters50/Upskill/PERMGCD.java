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
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int s = sc.nextInt();
		    solution(n,s);
		}
	}
	private static void solution(int n, int x){
	   if(x<n){
		       System.out.println("-1");
		   }
		   else{
		       int y = x-n+1;
		       System.out.print(y+" ");
		       for(int i=1;i<=n;i++){
		           if(i!=y){
		               System.out.print(i+" ");
		           }
		       }
		       System.out.println();
		   }
	}
	
}
