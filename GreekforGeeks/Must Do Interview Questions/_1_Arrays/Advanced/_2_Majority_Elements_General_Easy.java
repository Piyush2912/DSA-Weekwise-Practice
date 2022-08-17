package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays.Advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class _2_Majority_Elements_General_Easy {
    public static void main(String[] args) {
        int ar[] ={2,3,1,3,2,2,3,1};
        int k = 7;
        System.out.println(majorityElement(ar,k));
    }
    /*
    Efficient Sol: T(n) = O(n) and S(n) = O(n)
    1. Create HashMap
    2. Fill values as freq of key from array
        1) if map seeing first time value then add it as key and its value as 1
        2) if map has seen the value already then increment its value
    3. Store possible keys in ArrayList
    4. Sort the ArrayList
    5 Return res


     2,3,1,3,2,2,3,1

     Map < key , Value >
    i=0:    2   -   1-> 2-> 3
    i=1:    3   -   1-> 2
    i=2:    1   -   1-> 2
    i=3:(3)
    i=4:(2)
    i=5:(2)
    i=6:(1)
     Map < key , Value >
        2 - 3
        3 - 2
        1 - 2

     n/k = 8/7 = 1 => freq > 1
 all satisfy
 [2,3,1] => sort([2,3,1]) => [1,2,3] ANS
     */
    private static ArrayList<Integer> majorityElement(int[] ar, int k) {
        // Step 1: Creating HashMap
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // Step 2: Traverse Map and map freq
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])){
                int count = map.get(ar[i])+1;
                map.put(ar[i],count);
            }else{
                map.put(ar[i],1);
            }
        }
        // Step3: Store keys in arraylist if > N/K
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int key:map.keySet()){
            if (map.get(key) > ar.length/k ){
                res.add(key);
            }
        }
        // Step4: Sort the List
        Collections.sort(res);
        // Step5: return res
        return res;
    }

}
