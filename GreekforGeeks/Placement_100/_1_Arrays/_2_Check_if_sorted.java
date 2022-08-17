package com.company.Placement_100._1_Arrays;

public class _2_Check_if_sorted {
    public static void main(String[] args) {
        int ar[] = {400,200,300};
        System.out.println(naive(ar));
        System.out.println(efficient(ar));
        }

    private static boolean naive(int[] ar) {
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (ar[j] < ar[i]){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean efficient(int ar[]){
        int n = ar.length;
        for (int i = 1; i < n; i++) {
            if (ar[i] < ar[i-1])
                return false;
        }
        return true;
    }
}
