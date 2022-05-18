package com.company.DSA_PrepBytes._Week_1_Fundamental;
import java.util.Scanner;
public class _6_Perfect_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int sum = 0;
            int i = 1;
            while(i < n){
                if (n%i == 0){
                    sum += i;
                }
                i++;
            }
            if (sum == n){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }

    }
}
