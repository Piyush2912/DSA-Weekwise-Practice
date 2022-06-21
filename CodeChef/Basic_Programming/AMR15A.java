/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes herein
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count_lucky = 0;
		int count_unlucky = 0;
		for(int i=0;i<n;i++){
		    int input = sc.nextInt();
		    if(input % 2 == 0){
		        count_lucky++;
		    }else{
		        count_unlucky++;
		    }
		}
		if(count_lucky > count_unlucky){
		    System.out.println("READY FOR BATTLE");
		}else{
		    System.out.println("NOT READY");
		}
	}
}
