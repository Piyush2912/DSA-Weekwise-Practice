package com.company.DSA_PrepBytes._Week_1_Fundamental;
import java.util.Scanner;
public class _1_LeapYear {
    public static void main(String[] args) {
        //write your code here
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            System.out.println(chkLeapYear(n));
        }
    }
    public static String chkLeapYear(int n){
        if ((n % 400 ==0) || (n % 4 ==0 && n % 100 != 0) ){
            return "Yes";
        }
        return "No";
    }
}

