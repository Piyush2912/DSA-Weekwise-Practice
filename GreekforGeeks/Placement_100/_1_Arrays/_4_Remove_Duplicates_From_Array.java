package com.company.Placement_100._1_Arrays;

public class _4_Remove_Duplicates_From_Array {
    public static void main(String args[]){
        int ar[] = {10,20,20,30,30,30};
        int size = 6;
        System.out.println(naive(ar,size));
        System.out.println(efficient(ar,size));
    }

    //
    private static int naive(int[] ar, int size) {
        int temp[] = new int[size];
        temp[0] = ar[0];
        int res = 1;
        for (int i = 1; i < size; i++) {
            if (temp[res-1] != ar[i]){
                temp[res] = ar[i];
                res++;
            }
        }
        // copying back the element
        for (int i = 0; i < res; i++) {
            ar[i] = temp[i];
        }
        return res;
    }
    private static int efficient(int ar[],int size){
        int res = 1;
        for (int i = 1; i < size; i++) {
            if (ar[i] != ar[res-1]){
                ar[res] = ar[i];
                res++;
            }
        }
        return res;
    }
}
