package com.company.GreekforGreeks.Strings_Must_Do_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class _3_Roman_number_to_integer {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                res = res + map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));
            }else{
                res = res + map.get(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}
