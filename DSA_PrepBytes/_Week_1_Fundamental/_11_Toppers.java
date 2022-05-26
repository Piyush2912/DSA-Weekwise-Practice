package com.company.DSA_PrepBytes._Week_1_Fundamental;

import java.io.IOException;
import java.util.Scanner;

public class _11_Toppers {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            int dp[] = new int[1000];
            dp[0] = a;
            dp[1] = b;
            dp[2] = c;
            for(int i=0;n-->0;i++){
                if (i >= 3){
                    dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
                }
                System.out.print(dp[i]+" ");
            }
            System.out.println();
        }
    }
}
