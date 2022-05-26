package com.company.DSA_PrepBytes._Week_1_Fundamental;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class _19_Last_Exam {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            BigInteger b = new BigInteger("1018");
            b = b.pow(n);
            b = b.mod(BigInteger.TEN);
            System.out.println(b.toString());


        }

    }
}
