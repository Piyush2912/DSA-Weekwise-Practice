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
                    int ans =  0;
                    int p =sc.nextInt();
                    if(p < 0){
                        ans= -1;
                    }else if(p>=0 && p<11){
                        ans= p;
                    }else if(p>99 && p<110){
                        ans= p/100 + p%100;
                    }else if(p>199 && p<209){
                        ans= p/100 + p%100;
                    }else if(p>299 && p<308){
                        ans = p/100 + p%100;
                    }else if(p>399 && p<407){
                        ans = p/100 + p%100;
                    }else if(p>499 && p<506){
                        ans = p/100 + p%100;
                    }else if(p>599 && p<605){
                        ans = p/100 + p%100;
                    }else if(p>699 && p<704){
                        ans = p/100 + p%100;
                    }else if(p>799 && p<803){
                        ans = p/100 + p%100;
                    }else if(p>899 && p<902){
                        ans = p/100 + p%100;
                    }else if(p>999 && p<1001){
                        ans = p/100 + p%100;
                    }else{
                        ans = -1;
                    }
                    System.out.println(ans);
                
	}
	}
}
