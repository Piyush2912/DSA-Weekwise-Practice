package com.company.GreekforGreeks.Arrays_Must_Do_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _6_Frequencies_0f_Limited_Range_Array_Elements_2nd {
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
        int ans[] =new int[N+P];
        for (int i = 0; i < Math.max(N,P); i++) {
            ans[i] = 0;
        }
        for (int i = 0; i < N; i++) {
            ans[arr[i]] += 1; 
        }
       // System.out.println(Arrays.toString(ans));

        for (int i = 0; i < N; i++) {
            arr[i] = ans[i+1];
        }

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
