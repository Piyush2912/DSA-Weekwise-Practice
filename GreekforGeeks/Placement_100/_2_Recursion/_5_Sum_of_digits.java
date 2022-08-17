package com.company.Placement_100._2_Recursion;

public class _5_Sum_of_digits {
    public static void main(String[] args) {
        int n = 432;
        // op = 9
        System.out.println(sumofdigits(n));
    }
    // Code evolution / codevolution for learning React
    //
    private static int sumofdigits(int n) {
        if ( n < 10){
            return n;
        }
        return (n%10)+sumofdigits(n/10);

    }
}
