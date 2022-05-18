package com.company.DSA_PrepBytes._Week_1_Fundamental;

public class _4_V_Pattern {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

            int k = 1;
            while (k <= 2 * (rows - i)) {
                System.out.print(" ");
                k++;
            }
            int l = 1;
            while (l <= i) {
                System.out.print(i-l+1);
                l++;
            }
            i++;
            System.out.println();

        }
    }
}