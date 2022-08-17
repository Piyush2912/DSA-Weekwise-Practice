package com.company.GreekforGreeks.Arrays_Must_Do_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _4_Alternate_positive_and_negative_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        rearrange(ar,n);
        System.out.println(Arrays.toString(ar));
    }
    static void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        /*
        for (int i = 0; i < pos.size(); i++) {
            System.out.print(pos.get(i)+" ");
        }

        for (int i = 0; i < neg.size(); i++) {
            System.out.print(neg.get(i)+" ");
        }
        */

        //-5 -2  5  2 4  7 1 8 0 -8
        // 5  2  4  7 1  8 0
        //-5 -2 -8
        // 5 -5  2 -2 4 -8 7 1 8  0

        //
        int i = 0;

        int k = 0;
        int l = 0;

        for (i = 0; i < n; i++) {
            if (k == pos.size() || l == neg.size()){
                break;
            }
            if (i % 2 == 0 ){
                arr[i] = pos.get(k++);
            }

            if (i % 2 != 0){
                arr[i] = neg.get(l++);
            }
        }
        while (k < pos.size()){
            arr[i++] = pos.get(k++);
        }
        while (l < neg.size()){
            arr[i++] = neg.get(l++);
        }
    }

    /*
    9
    9 4 -2 -1 5 0 -5 -3 2
10
-5 -2 5 2 4 7 1 8 0 -8
     */

}
