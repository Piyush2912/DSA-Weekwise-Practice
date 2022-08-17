package com.company.GreekforGreeks.Strings_Must_Do_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class _2_Longest_Common_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        String input[] ={"geeksforgeeks", "geeks", "geek","geezer"};
        // calling and output
        System.out.println(prefix(input,input.length));
    }

    private static String prefix(String[] input,int n) {
        if (n == 0){
            return "-1";
        }

        String result= "";
        Arrays.sort(input);
        String a = input[0];
        String b = input[n-1];

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)){
                result = result + a.charAt(i);
            }else{
                break;
            }
        }
        if (result == ""){
            return "-1";
        }
        return result;
    }
}
