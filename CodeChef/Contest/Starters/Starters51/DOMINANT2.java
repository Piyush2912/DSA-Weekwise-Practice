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
		Scanner sc =new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int n = sc.nextInt();
		    int ar[] = new int[n];
		    for(int i=0;i<n;i++){
		        ar[i] = sc.nextInt();
		    }
		    
		    java.util.Map<Integer,Integer> map = new java.util.HashMap<>();
		    for(int i=0;i<n;i++){
		        if(map.containsKey(ar[i])){
		            map.put(ar[i], map.get(ar[i]) + 1);
		        }else{
		            map.put(ar[i], 1);
		        }
		    }
		    int flag = 0;
		    int majority_element = 0;
		    for(Map.Entry<Integer,Integer> i : map.entrySet()){
		        if(i.getValue() > majority_element){
		            majority_element = i.getValue();
		        }
		    }
		    for(Map.Entry<Integer,Integer> i : map.entrySet()){
		        if(i.getValue() == majority_element){
		            flag++;
		        }
		    }
		    if(flag > 1){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		    
		    
		}
	}
}
