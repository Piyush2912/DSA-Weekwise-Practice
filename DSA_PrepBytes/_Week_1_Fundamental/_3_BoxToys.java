package com.company.DSA_PrepBytes._Week_1_Fundamental;
import java.io.IOException;
import java.util.Scanner;

public class _3_BoxToys {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n-- > 0){
            int t = sc.nextInt();
            int c = sc.nextInt();
            if (c - (t + 2) >= 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

// 1 1  2 Yes (Capacity - ( already present toys + 2) >= 0) : 2
// 2 2  4 Yes
// 5 5  6 No
// 6 6 10 No
//
