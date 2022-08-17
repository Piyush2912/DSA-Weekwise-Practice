package com.company.GreekforGreeks.Hashing_Must_Do_Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class _1_Key_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(hasArrayTwoCandidates(ar,n,x));
/*
6 16
1 4 45 6 10 8
*/
    }
    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> map = new HashSet<Integer>();
        map.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (map.contains(x-arr[i])){
                return true;
            }else{
                map.add(arr[i]);
            }
        }
        return false;
    }
}
