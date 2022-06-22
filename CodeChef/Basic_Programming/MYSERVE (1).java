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
		    int p = sc.nextInt();
		    int q = sc.nextInt();
		    int s = p + q + 1;
		    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		    // A A B B A A B B A A B  B  A  A  B  B   A  A  B  B  A 
		    /*if(s < 2 || s >=4 && s <=5 || s>=8 && s<=9 || s>=12 && s<=13 || s>=16 && s<=17 || s>=20 && s<=21 ){
		        System.out.println("Alice");
		    } else{
		        System.out.println("Bob");
		    }
		    */
		    if(s % 4 == 1 || s % 4 == 2){
		        System.out.println("Alice");
		    }else{
		        System.out.println("Bob");
		    }
		
	}
}
}
