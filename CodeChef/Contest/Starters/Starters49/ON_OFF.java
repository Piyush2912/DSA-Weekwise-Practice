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
		int testcase = sc.nextInt();
		while(testcase-- > 0){
		    int n = sc.nextInt();
		    String S = sc.next();
		    String R = sc.next();
		    int count = 0;
		    for(int i=0; i<n; i++){
		        if(S.charAt(i) != R.charAt(i)){
		            count++;
		        }
		    }
		    System.out.println(count % 2 == 0 ? 1 : 0 );
		}
	}
}
