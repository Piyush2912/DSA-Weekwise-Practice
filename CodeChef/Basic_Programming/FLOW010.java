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
		    char a = sc.next().charAt(0);
		    if(a == 'B' || a == 'b'){
		        System.out.println("BattleShip");
		    }else if (a == 'C' || a == 'c'){
		        System.out.println("Cruiser");
		    }else if (a == 'D' || a == 'd' ){
		        System.out.println("Destroyer");
		    }else if (a == 'F' || a == 'f'){
		        System.out.println("Frigate");
		    }
		}
	}
}
