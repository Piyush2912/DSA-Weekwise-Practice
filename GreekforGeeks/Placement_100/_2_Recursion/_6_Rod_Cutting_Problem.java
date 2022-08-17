package com.company.Placement_100._2_Recursion;

public class _6_Rod_Cutting_Problem {
    public static void main(String[] args) {
        int n = 5, a = 2, b = 5, c = 1;
        System.out.println(maxCut(n,a,b,c));
    }
    // Naive Approach
    private static int maxCut(int n, int a, int b, int c) {
        // base case
        if (n == 0) return 0;
        if (n < 0) return -1;

        int res = Math.max(maxCut(n-c,a,b,c),Math.max(maxCut(n-a,a,b,c),maxCut(n-b,a,b,c)));

        if (res == -1){
            return -1;
        }
        return res+1;
    }
}
