package com.company.GreekforGreeks.Arrays_Must_Do_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class _3_Plus_One {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            ar.add(sc.nextInt());
        }
        System.out.println(increment(ar,size));

    }
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here
        for (int i = N-1; i >=0 ; i--) {
            if (arr.get(i) < 9 ){
                arr.set(i,arr.get(i) + 1);
                return arr;
            }
            arr.set(i,0);
        }
        arr.set(0,1);
        arr.add(0);
        return arr;
    }
}
/*
3
1 2 4
1 2 8
1 2 7


 */