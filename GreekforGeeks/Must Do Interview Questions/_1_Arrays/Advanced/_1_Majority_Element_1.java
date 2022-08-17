package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays.Advanced;

import java.util.ArrayList;
import java.util.Arrays;

public class _1_Majority_Element_1 {
    public static void main(String[] args) {
        int ar[] = {1,1,1,1};
        System.out.println(majorityElementEfficient(ar));
    }

    private static ArrayList<Integer> majorityElementEfficient(int[] ar) {
        // Initialize values
        int val1 = ar[0];
        int count1 = 1;

        int val2 = ar[0];
        int count2 = 0;
        // because i have taken into account the 1st element of array

        for(int i =1; i < ar.length; i++){
            if (ar[i] == val1){
                count1++;
            }else if(ar[i] == val2){
                count2++;
            }else{
                if (count1 == 0){
                    // chance ar[i]
                    val1 = ar[i];
                    count1 = 1;
                }else if (count2 == 0){
                    // chance ar[i]
                    val2 = ar[i];
                    count2++;
                }else{
                    // we can make pairing triplets
                    count1--;
                    count2--;
                }
            }
        }

        // ArrayList
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (isGreaterthanNby3(ar,val1)){
            res.add(val1);
        }
        if (val1 != val2 && isGreaterthanNby3(ar,val2)){
            res.add(val2);
        }
        return res;
    }
    static boolean isGreaterthanNby3(int ar[],int val){
        int freq = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == val){
                freq++;
            }
        }
        if (freq > ar.length/3){
            return true;
        }
        return false;
    }
}
