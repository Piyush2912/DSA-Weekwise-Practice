package com.company.GreekforGreeks.Strings_Must_Do_Questions;

import java.util.Scanner;

public class _1_Reverse_words_in_a_given_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "pqr.mno";
        System.out.println(reverseWords(s));

    }


    public static String reverseWords(String S)
    {
        if (S.length() <= 0){
            return "";
        }
        StringBuilder br = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i <S.length(); i++) {
            if (S.charAt(i) == '.'){
                ans = ans.append(br.reverse());
                ans = ans.append('.');
                br = new StringBuilder("");
            }else{
                br=br.append(S.charAt(i));
            }
        }

        StringBuilder temp =new StringBuilder("");
        int i = S.length();
        int flag = 0;
        while(i-- >0 ){
            if (S.charAt(i) == '.'){
                flag = 1;
            }
            if (flag == 1){
                break;
            }
            temp = temp.append(S.charAt(i));
        }
        ans.append(temp);

        return String.valueOf(ans.reverse());
    }
}
