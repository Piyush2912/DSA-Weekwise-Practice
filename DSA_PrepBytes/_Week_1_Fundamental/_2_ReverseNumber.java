package com.company.DSA_PrepBytes._Week_1_Fundamental;
import java.util.Scanner;
public class _2_ReverseNumber {
    //write your code here
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long no = 0;
    while(n > 0){
        long rem = n % 10;
        no = no * 10 + rem;
        n = n / 10;
    }
    System.out.println(no);
}
}
