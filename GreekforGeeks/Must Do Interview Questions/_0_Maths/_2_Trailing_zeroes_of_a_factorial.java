package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._0_Maths;

import java.util.Scanner;

public class _2_Trailing_zeroes_of_a_factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = 10;
        long factorial = fact(n);
        long ans = extractZeros( factorial);
        System.out.println(ans);
    }

    private static int fact(int n){
        if(n <= 1)  return 1;
        return n*fact(n-1);
    }
    private static int extractZeros(long n){
        int countZero = 0;
        while(n > 0){
            long lastDigit = n % 10;
            n = n / 10;
            if (lastDigit == 0) countZero++;
        }
        return countZero;
    }
    /*
    Clarify Question:
    n = 0:  fact = 1
    n = 1:  fact = 1
    n = 5:  fact = 5*4*3*2*1 = 120 => op = 1
    n = 6:  fact = 6*5*3*2*1 = 720 => op = 1
    n = 7:  fact = 7*6*5*3*2*1 = 5040 =>op = 1
    n = 8:  fact = 8*7*6*5*3*2*1 = 40320 => op = 1
    n = 9:  fact = 9*8*7*6*5*3*2*1 = 362880 => op = 1
    n = 10: fact = 10*362880 = 3628800 => op = 2
    n = 11: fact = 11 * 3628800 = 8600 => op = 2

    EDGE CASES[if (n < 10) return 1;]

    find factorial of a number 1st
    then from that number i can extract no of zeros

    int fact(int n){
        if(n <= 1)  return 1;
        return n*fact(n-1)
    }
    int extractZeros(int n){
        int countZero = 0;
        while(n > 0){
        int lastDigit = n % 10;
        n = n / 10;
        if (lastDigit == 0) countZero++;
        }
        return countZero;
    }
     */
    // Efficient Solution
    /*
    n = 10
    1st : i = 5 : 10/5 = 2 >= 1 ->True = > count = 0+2
    2nd : i = 25: 10/25 = 2/5 = 0.4 => 0 >= 1 => false : count = 2
    return count; op  = 2;
     */
    static int trailingZeroes(int N){
        if (N < 0)
            return -1;

        int count = 0;

        for (int i = 5; N / i >= 1; i *= 5)
            count += N/ i;
        return count;
    }
}
