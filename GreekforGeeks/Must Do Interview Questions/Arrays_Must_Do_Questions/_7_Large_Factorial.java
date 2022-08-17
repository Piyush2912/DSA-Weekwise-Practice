package com.company.GreekforGreeks.Arrays_Must_Do_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _7_Large_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ar =new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(factorial(ar,n)));

    }
    public static long[] factorial(long a[], int n){
        long max = a[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(a[i],max);
        }


        long dp[] =new long[(int)max+1];
        long mod = 1000000007;

        dp[0] = 1;
        dp[1] = 1;
        // 0 1 2 3 4
        // 1 1 2 6 24
        for (int i = 2; i <= max; i++) {
            dp[i] = ((i * dp[i-1])%mod)%mod;
        }

        //System.out.println(Arrays.toString(dp));

        for (int i = 0; i <n ; i++) {
            a[i] = dp[(int)a[i]];
        }

        //System.out.println(Arrays.toString(a));
        return a;
    }
}
/*
5
0 1 2 3 4

3
5 6 3
 */
