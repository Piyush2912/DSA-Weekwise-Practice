package com.company.DSA_450;

import java.util.Scanner;

public class _Array_1_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long ar[] = new long[(int)n];
            for(long i = 0; i < n; i++){
                ar[(int)i] = sc.nextLong();
            }
            int start = 0;
            int end = (int)n-1;
            while(start <=end){
                long temp = ar[start];
                ar[start] = ar[end];
                ar[end] = temp;
                start++;
                end--;
            }
            for(long i=0; i<n; i++){
                System.out.print(ar[(int)i]+" ");
            }
            System.out.println();
        }
    }
}
