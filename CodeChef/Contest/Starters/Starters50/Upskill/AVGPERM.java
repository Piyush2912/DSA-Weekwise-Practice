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
		    solution(n);
		}
	}
	private static void solution(int n){
	   if(n==3)
		    System.out.println("1 2 3");
		    else{
		        System.out.print(n+" "+(n-3)+" ");
		        for(int i=1;i<=n-4;i++){
		            System.out.print(i+" ");
		        }
		        System.out.println((n-2)+" "+(n-1));
		    }
	}
}
