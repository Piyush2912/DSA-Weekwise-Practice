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
		char a = sc.next().charAt(0);
		if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
		    System.out.println("Vowel");
		}else{
		    System.out.println("Consonant");
		}
	}
}
