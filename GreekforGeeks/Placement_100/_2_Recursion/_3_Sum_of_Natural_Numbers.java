package com.company.Placement_100._2_Recursion;

public class _3_Sum_of_Natural_Numbers {
    public static void main(String[] args) {
        int n = 2;
        // op = 1 + 2 = 3
        System.out.println(sum_of_naturalNo(n));
    }
    // T(n) = Theta(n)
    // S(n) = Theta(n)
    // T(n) = T(n-1) + Theta(1)
    private static int sum_of_naturalNo(int n) {
        if (n == 0){
            return 0;
        }
        return n+sum_of_naturalNo(n-1);
    }
}
