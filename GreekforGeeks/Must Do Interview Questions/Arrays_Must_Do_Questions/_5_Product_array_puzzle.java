package com.company.GreekforGreeks.Arrays_Must_Do_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class _5_Product_array_puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] =new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf(ar,n)));
    }
    public static long[] productExceptSelf(int nums[], int n)
    {
        // code here
        long pr = 1;
        long ans[] = new long[n];
        int flag = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pr = pr * nums[i];
            }
            if (nums[i] == 0){
                flag = 1;
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == pr){
                ans[i] = 0;
            }
            if (nums[i] == 0){
                ans[i] = pr;
            }else {
                ans[i] = (pr / nums[i]);
            }
        }
        // if only 1 zero exist
        if (flag == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    continue;
                } else {
                    ans[i] = 0;
                }
            }
        }
        // if two zeros exist
        if (count > 1){
            for (int i = 0; i < n; i++) {
                ans[i]  =0;
            }
        }

        return ans;
    }
}
