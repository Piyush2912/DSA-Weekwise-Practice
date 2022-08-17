package com.company.GreekforGreeks.Arrays_Must_Do_Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int ar[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int result = majorityElement(ar,n);
        System.out.println(result);

    }
    static int majorityElement(int a[], int size){
        // your code here
        if (size == 1){
            return a[0];
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        /*
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        */
        int ans = 0;
        int key = 0;
        int flag =0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
                ) {
            if (entry.getValue() > size/2 ){
                flag = 1;
                key = entry.getKey();
                return entry.getKey();
            }
        }
        if (flag == 0){
            return -1;
        }
        return key;

    }
}
/*
5
3 1 3 3 2
 */
