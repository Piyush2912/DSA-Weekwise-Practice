package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _3_Plus_One {
    public static void main(String[] args) {
        int ar[] = {9,9,9};
        System.out.println(Arrays.toString(plusOneNaive(ar)));
    ArrayList<Integer> ar1 = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            ar1.add(9);
        }
        System.out.println(plusOneArraylist(ar1));
    }

    /*
    Efficient Approach:
    [1,2,4] => [1,2,5]
    [1,9,9] => [2,0,0]
    [9,9,9] => [1,0,0,0]

    Step 1: loop from end till 0th index
    Step 2: Check if digit is less than 9
            1) if less than 9 increment and return ans;
            2) if it is equal to 9 then, set digit = 0;
    Step 3: if we reach end of loop Special case: 999
            1)new array[n+1] => all element 0;
            2)set(1st index = 0)
    Step4: return ans;
     */
    private static int[] plusOneNaive(int[] ar) {
        // Step 1:
        for (int i = ar.length-1; i >= 0 ; i--) {
            // Step 2:
            if (ar[i] < 9){
                // simple addition and return ans
                ar[i] = ar[i] +1;
                return ar;
            }else{
                // if digit is equal to 9
                ar[i] = 0;
            }
        }
        // Step 3: Special Case 999
        int ans[] = new int[ar.length+1];
        for (int i = 0; i < ar.length+1; i++) {
            ans[i] = 0;
        }
        // Step 4: set 1st digit correctly
        ans[0] = 1;
        return ans;
    }
    private static ArrayList<Integer> plusOneArraylist(ArrayList<Integer> arr){
        for(int i=arr.size()-1; i>=0;i--){
            if (arr.get(i) < 9){
                arr.set(i,arr.get(i)+1);
                return arr;
            }else{
                arr.set(i,0);
            }
        }
        arr.set(0,1);
        arr.add(0);
        return arr;

    }
}
