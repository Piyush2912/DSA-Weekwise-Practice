package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays;

import java.util.Arrays;
import java.util.ArrayList;
public class _6_Frequencies_of_Limited_Range_Array_Elements {
    public static void main(String[] args) {
        int ar[] = {2,3,2,3,5};
        int p = 5;
        System.out.println(Arrays.toString(naive(ar,p)));
    }
    /*
    Naive:
        loop from 0 to p
            loop from 0 to n
                take a[i] and compare with every elemnt to find its freq
     T(n) = O(n^2), S(n) = O(n)
     */
    private static int[] naive(int[] ar, int p) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i <= ar.length; i++) {
            int count = 0;
            for (int j = 0; j < ar.length; j++) {
                if (i == ar[j]){
                    count++;
                }
            }
            res.add(count);
        }
        int ans[] = new int[p];
        for (int i = 0; i < p; i++) {
            ans[i] = res.get(i+1);
        }
        return ans;
    }

}
