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
		    int ar[] =new int[7];
		    for(int i=0;i<7;i++){
		        ar[i] = sc.nextInt();
		    }
		    int count_sunny = 0;
		    int count_rainy = 0;
		    for(int i=0;i<7;i++){
		        if(ar[i] == 1){
		            count_sunny++;
		        }else{
		            count_rainy++;
		        }
		    }
		    if(count_sunny > count_rainy){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
