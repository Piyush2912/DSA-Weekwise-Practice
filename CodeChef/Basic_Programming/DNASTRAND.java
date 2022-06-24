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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    String str = br.readLine();
		    String res = "";
		    for(int i = 0; i < n; i++){
		        if( str.charAt(i) == 'A'){
		            res = res + 'T';
		        }else if(str.charAt(i) == 'T'){
		            res = res + 'A';
		        }else if(str.charAt(i) == 'C'){
		            res = res + 'G';
		        }else if(str.charAt(i) == 'G'){
		            res = res + 'C';
		        }else{
		            res = res + str.charAt(i);
		        }
		    }
		    System.out.println(res);
		}
	}
}
