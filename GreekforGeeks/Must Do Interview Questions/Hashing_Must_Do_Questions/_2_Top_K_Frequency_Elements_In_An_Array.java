package com.company.GreekforGreeks.Hashing_Must_Do_Questions;

import java.util.*;

public class _2_Top_K_Frequency_Elements_In_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topK(nums,k)));
    }
    public static int[] topK(int[] nums, int k) {
        // Code here
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int ans[]= {1};
        return ans;
    }
}
