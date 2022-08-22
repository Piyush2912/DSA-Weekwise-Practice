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
		// freq of element/2 <= size of array => Yes Otherwise No
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int n = sc.nextInt();
		    int ar[] = new int[n];
		    for(int i=0;i<n;i++){
		        ar[i] = sc.nextInt();
		    }
		    java.util.Map<Integer,Integer> map = new java.util.HashMap<Integer,Integer>();
		    for(int i=0;i<n;i++){
		        if(map.containsKey(ar[i])){
		            map.put(ar[i], map.get(ar[i]) + 1);
		        }else{
		            map.put(ar[i],1);
		        }
		    }
		    int counter=  1; // set to Yes rearrangement possible
		    int size = n%2==0? n/2: (n/2) + 1;
		    for(Map.Entry<Integer,Integer> i : map.entrySet()){
		        if(i.getValue() > size){
		            counter = 0;
		            break;
		        }
		    }
		    if(counter == 0){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}
		
	}
}
