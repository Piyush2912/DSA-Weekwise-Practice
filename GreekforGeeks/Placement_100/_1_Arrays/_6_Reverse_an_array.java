package com.company.Placement_100._1_Arrays;

import java.util.Arrays;

public class _6_Reverse_an_array {
    public static void main(String[] args) {
        int ar[] = {10,5,7,30};
        System.out.println(Arrays.toString(reverse(ar)));
    }
    // Only Solution theta(n/2) = O(n)
    private static int[] reverse(int[] ar) {
        int low = 0, high = ar.length-1;
        while(low < high){
            int temp = ar[low];
            ar[low]  = ar[high];
            ar[high] = temp;
            low++;
            high--;
        }
        return ar;
    }
}
