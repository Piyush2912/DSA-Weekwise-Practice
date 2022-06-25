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
                while(t-- > 0) {
                    int n = sc.nextInt();
                    int ar[] = new int[n];
                    for (int i = 0; i < n; i++) {
                        ar[i] = sc.nextInt();
                    }
                    HashMap map = new HashMap<Integer, Integer>();
                    for (int i = 0; i < n; i++) {
                        if (map.containsKey(ar[i])) {
                            Integer count = (Integer) map.get(ar[i]);
                            map.put(ar[i], count + 1);
                        } else {
                            map.put(ar[i], 1);
                        }
                    }
                    int max = 0;
                    Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Integer, Integer> pair = it.next();
                        if(pair.getValue() > max) {
                            max = pair.getValue();
                        }
                    }
                    System.out.println(n - max);
                }
           
	}
}
