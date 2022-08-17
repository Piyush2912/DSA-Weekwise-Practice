package com.company.Placement_100._1_Arrays;

import java.util.Arrays;

public class _5_Move_All_Zeros_To_End {
    public static void main(String[] args) {
        int ar[] = {8,5,0,10,0,20};
        System.out.println(Arrays.toString(naive(ar)));
        System.out.println(Arrays.toString(efficient_moveZeros(ar)));
    }

    private static int[] naive(int[] ar) {
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            if (ar[i] == 0){
                for (int j = i+1; j < n; j++) {
                    if (ar[j] != 0){
                        swap(ar,i,j);
                    }
                }
            }
        }
        return ar;
    }
    private static void swap(int ar[],int i,int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // Efficient Solution
    // is to keep track using count of non zero element
    private static int[] efficient_moveZeros(int ar[]){
        int n = ar.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] != 0){
                swap(ar,i,count);
                count++;
            }
        }
        return ar;
    }
}
