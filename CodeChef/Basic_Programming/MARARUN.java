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
		int t= sc.nextInt();
		while(t-- > 0){
		    int D = sc.nextInt();
		    int d = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		  if((D*d) >= 10 && (D*d)<21) {
				System.out.println(a);
			}else if ((D*d) >= 21 && (D*d)<42) {
				System.out.println(b);
			}
			else if((D*d) >= 42) {
				System.out.println(c);
			}else {
				System.out.println(0);
			}
		}
	}
}
