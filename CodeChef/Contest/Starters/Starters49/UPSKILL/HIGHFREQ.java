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
		    int freq[]= new int[n];
		    for(int i=0;i<n;i++){
		        int num = sc.nextInt();
		        freq[num-1]++;
		    }
	       Arrays.sort(freq);
	        
		    int pos1 = (freq[n-1] + 1)/2;
		    int pos2 = freq[n-2];
		    System.out.println(Math.max(pos1,pos2));
		}
	}
}
