package com.company.GreekforGreeks.Hashing_Must_Do_Questions;

import java.util.HashMap;
import java.util.HashSet;

public class _3_Intersection_of_two_arrays {

    public static void main(String[] args) {
     int   n = 6, m = 5;
      int  a[] = {1, 2, 3, 4, 5, 6};
       int b[] = {3, 4, 5, 6, 7};

        System.out.println(NumberofElementsInIntersection(a,b,n,m));
    }
    public static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        //Your code here
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            map.put(a[i],1);
        }

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i])){
                count++;
                map.remove(b[i]);
            }
        }
        return count;
    }
}
