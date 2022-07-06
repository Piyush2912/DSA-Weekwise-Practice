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
		    int n = 5;
		    int ar[] = new int[n];
		    int count = 0;
		    for(int i=0;i<n;i++){
		        ar[i] = sc.nextInt();
		        if(ar[i] == 1){
		            count++;
		        }
		    }
		    if(count == 0){
		        System.out.println("Beginner");
		    }else if(count == 1){
		        System.out.println("Junior Developer");
		    }else if(count == 2){
		        System.out.println("Middle Developer");
		    }else if(count == 3){
		        System.out.println("Senior Developer");
		    }else if(count == 4){
		        System.out.println("Hacker");
		    }else if(count == 5){
		        System.out.println("Jeff Dean");
		    }
		    
		}
	}
}
