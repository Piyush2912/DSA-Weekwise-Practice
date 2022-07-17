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
		    int count = 0;
		    int flag = 1;
		    for(int i=0;i<n;i++){
		        char ch = str.charAt(i);
		        if(ch == 'a' || ch == 'e' || ch == 'i'|| ch =='o' || ch=='u'){
		            count = 0;
		        }else{
		            count++;
		            if(count == 4){
		                flag = 0;
		                break;
		            }
		        }
		    }
		    if(flag == 1){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
		
	}
}
