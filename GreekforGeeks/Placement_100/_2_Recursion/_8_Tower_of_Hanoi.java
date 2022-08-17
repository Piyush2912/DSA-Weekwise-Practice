package com.company.Placement_100._2_Recursion;

public class _8_Tower_of_Hanoi {
    public static void main(String[] args) {
        int n = 2;
        TOH(n,'A','B','C');
    }
    // T(n) = O(n)
    // S(n) = O(n)
    // T(n) = 2T(n-1) + 1
    // Number of moments = 2^n - 1
    // source, auxilary space, destination
    private static void TOH(int n, char A, char B, char C) {
        // base case
        if (n == 1){
            System.out.println("Move 1 from" + A + " to " + C);
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        TOH(n-1,B,A,C);
    }
}
