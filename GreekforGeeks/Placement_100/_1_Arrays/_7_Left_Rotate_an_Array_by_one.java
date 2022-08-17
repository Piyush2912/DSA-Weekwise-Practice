package com.company.Placement_100._1_Arrays;

import java.util.Arrays;

public class _7_Left_Rotate_an_Array_by_one {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        lRotateOne(ar);
        System.out.println(Arrays.toString(ar));
    }
    // only solution with time complexity O(n)
    private static void lRotateOne(int[] ar) {
        int n = ar.length;
        int temp = ar[0];
        for (int i = 1; i <n; i++) {
            ar[i-1] = ar[i];
        }
        ar[n-1] = temp;
    }
}
