package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays;

import java.util.Arrays;

public class _7_Large_Factorials {
    public static void main(String[] args) {
        int n = 5;
        int ar[] = {0,1,2,3,4};
        int[] a = fact(ar,n);
        System.out.println(Arrays.toString(a));
    }

    private static int[] fact(int[] a, int n) {
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
            a[i] = (int) dp[(int)a[i]];
        }

        //System.out.println(Arrays.toString(a));
        return a;
    }
}
