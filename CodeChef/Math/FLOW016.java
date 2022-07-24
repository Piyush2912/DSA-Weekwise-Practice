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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    System.out.println(gcd(a,b)+ " " +lcm(a,b));
		}
	}
	public static int gcd(int a,int b){
	    while(b > 0){
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
	public static int gcd(int ar[],int n){
	    int temp = ar[0];
	    for(int i=1;i<n;i++){
	        temp = gcd(ar[i],temp);
	    }
	    return temp;
	}
	public static int lcm(int a,int b){
	    return a*(b/gcd(a,b));
	}
	public static int lcm(int ar[],int n){
	    int temp = ar[0];
	    for(int i=1;i<n;i++){
	        temp = lcm(ar[i],temp);
	    }
	    return temp;
	}
}
