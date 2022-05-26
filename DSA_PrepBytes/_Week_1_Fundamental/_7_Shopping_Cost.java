package com.company.DSA_PrepBytes._Week_1_Fundamental;

import java.io.IOException;
import java.util.Scanner;

public class _7_Shopping_Cost {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            double q = sc.nextDouble();
            double p = sc.nextDouble();
            if (q > 100){
                p = (p * q) - (p*q * 0.2);
            }else{
                p = p * q;
            }
            System.out.println(p);
        }
    }
}
