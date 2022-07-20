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
		int testcase = sc.nextInt();
		while(testcase-- > 0){
		    int length = sc.nextInt();
		    String s = sc.next();
		   /* java.util.Map<Character,Integer> map = new java.util.HashMap<>();
		    for(int i=0;i<length;i++){
		        if(map.containsKey(s.charAt(i))){
		            map.put(s.charAt(i),map.get(s.charAt(i))+1);
		        }else{
		            map.put(s.charAt(i),1);
		        }
		    }
		    int beg = 0;
		    int end = length-1;
		    while(beg <= end){
		        if(s.charAt(beg) == s.charAt(end)){
		            beg++;
		            end--;
		        }else{
		            int freq0 = map.get('0');
		            int freq1 = map.get('1');
		            if(freq0 < freq1){
		                s = s.substring(0,beg-1) + s.substring(beg+1,length-1);
		            }else{
		                s = s.substring(0,beg) + s.substring(beg+1,end-1) + s.substring(end+1,length-1);
		            }
		            beg= 0;
		            end= length-1;
		        }
		    }
		    System.out.println(s);
		    */
		    int min = 0;
		    int count0 = 0;
		    int count1 = 0;
		    for(int i=0;i<length;i++){
		        if(s.charAt(i) == '0'){
		            count0++;
		        }
		        if(s.charAt(i) == '1'){
		            count1++;
		        }
		    }
		    String ans = "";
		    if(count0 <= count1){
		        for(int i=0;i<count1;i++){
		            ans += '1';
		        }
		    }else{
		        for(int i=0;i<count0;i++){
		            ans += '0';
		        }
		    }
		    System.out.println(ans);
		}
	}
}
