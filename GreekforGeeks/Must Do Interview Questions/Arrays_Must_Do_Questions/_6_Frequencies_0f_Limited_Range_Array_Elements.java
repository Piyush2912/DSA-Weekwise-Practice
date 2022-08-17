package com.company.GreekforGreeks.Arrays_Must_Do_Questions;

import java.util.*;

public class _6_Frequencies_0f_Limited_Range_Array_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] =  new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        frequencyCount(ar,n,p);
        System.out.println(Arrays.toString(ar));
    }
    public static void frequencyCount(int arr[], int N, int P)
    {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        // traverse the array
        for (int i = 1; i <= P; i++) {
            mp.put(i,0);
        }
        
        for (int i = 0; i < N; i++)
        {
            // update the frequency
            if (!mp.containsKey(arr[i]))
                mp.put(arr[i],0);

            mp.put(arr[i],mp.get(arr[i])+1);
        }


        // traverse the hashmap
        int iter = 0;
        for (Map.Entry<Integer, Integer> kvp : mp.entrySet())
        {
            //System.out.println(kvp.getKey() + " " + kvp.getValue());
            if(iter >= arr.length ){
                break;
            }
            arr[iter++] = kvp.getValue();
        }
        for (int i = P; i < N; i++) {
            arr[i] = 0;
        }
        //System.out.println(Arrays.toString(ans));
    }
}
/*
4
3 3 3 3
3

5
2 3 2 3 5
5
 */
