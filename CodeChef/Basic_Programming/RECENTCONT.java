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
	        int n = sc.nextInt();
	        String ch[] = new String[n];
	        for(int i=0;i<n;i++){
	            ch[i] = sc.next();
	        }
	        int count_s = 0;
	        int count_l = 0;
	        for(int i=0;i<n;i++){
	            if(ch[i].equals("START38")){
	                count_s++;
	            }else{
	                count_l++;
	            }
	        }
	        System.out.println(count_s + " " + count_l);
	    }
	    
	}
}
