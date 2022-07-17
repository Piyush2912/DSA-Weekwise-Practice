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
		    int even[] =new int[26];
		    int odd[] = new int[26];
		    for(int i=0;i<n;i++){
		        if(i % 2 == 0){
		            even[str.charAt(i) - 'a']++; 
		        }else{
		            odd[str.charAt(i) - 'a']++;
		        }
		    }
		    int flag = 1;
		    for(int i=0;i<26;i++){
		        if(even[i] != odd[i]){
		            flag = 0;
		            break;
		        }
		    }
		    if(flag == 0){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}
	}
}
