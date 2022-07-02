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
		    int ar[] = new int[10];
		    for(int i=0;i<10;i++){
		        ar[i] = sc.nextInt();
		    }
		    int count_even = 0;
		    int count_odd = 0;
		    for(int i=0;i<10;i++){
		        if(i % 2 == 0 && ar[i] == 1){
		            count_even++;
		        }else if(i%2 != 0 && ar[i] == 1){
		            count_odd++;
		        }
		    }
		    if(count_even>count_odd){
		        System.out.println(1);
		    }else if(count_even<count_odd){
		        System.out.println(2);
		    }else{
		        System.out.println(0);
		    }
		}
	}
}
