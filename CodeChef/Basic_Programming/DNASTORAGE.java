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
		    int n = sc.nextInt();
		    String str = sc.next();
		    for(int i=0;i<n-1;i++){
		        if(str.charAt(i) == '0' && str.charAt(i+1) == '0'){
		            System.out.print('A');
		            i++;
		        }else if(str.charAt(i) == '0' && str.charAt(i+1) == '1'){
		            System.out.print('T');
		            i++;
		        }else if(str.charAt(i) == '1' && str.charAt(i+1) == '0'){
		            System.out.print('C');
		            i++;
		        }else if(str.charAt(i) == '1' && str.charAt(i+1) == '1'){
		            System.out.print('G');
		            i++;
		        }else{
		            System.out.println();
		        }
		    }
           System.out.println();
		}
	}
}
