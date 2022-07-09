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
		    int d = sc.nextInt();
		    String str = sc.next();
		    int flag = 0;
		    for(int i=0;i<d;i++){
		        if(str.charAt(i) == '0' || str.charAt(i) == '5'){
		            flag = 1;
		            break;
		        }
		    }
		    if(flag == 1){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
