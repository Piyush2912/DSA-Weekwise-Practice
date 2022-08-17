package com.company.Placement_100._2_Recursion;

public class _1_Print_n_to_1 {
    public static void main(String[] args) {
        int n=5;
        // 5 4 3 2 1
        printnto1(n);
    }
    // T(n) = Theta(n)
    // S(n) = Theta(n)
    // T(n) = T(n-1) + Theta(n)
    private static void printnto1(int n) {
        if (n == 0) return;
        System.out.println(n);
        printnto1(n-1);
    }
}
