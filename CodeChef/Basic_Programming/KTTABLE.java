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
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=sc.nextInt();
		    }
		    int count = 0;
		   	if (a[0] >= b[0]) {
				count++;
			}
			for (int i = 0; i < n; i++) {
				if (i > 0 && (a[i] - a[i - 1]) >= b[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
