package com.company.Placement_100._2_Recursion;

public class _2_Print_1_to_n {
    public static void main(String[] args) {
        int n = 5;
        print1toN(5);
    }
    // T(n) = O(n)
    // This is not a tail recursion
    //
    private static void print1toN(int n) {
        if (n == 0){
            return;
        }
        // print1toN
        print1toN(n-1);
        System.out.println(n);
    }
}
