package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._0_Maths;
import java.util.*;

public class _1_Missing_Number_in_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ar[] = {1,2,4};
        System.out.println(MissingNo(ar));
        System.out.println(MissingNoMaths(ar));
    }
//      i = 1: [1 2 4] 1 != 1
    //  i = 2: [1 2 4] 2 != 2
    //  i = 3: [1 2 4] 3 != 4
    private static int MissingNo(int[] ar) {
        int n = ar.length;
        for (int index = 1; index <= n; index++) {
            if (index != ar[index-1]){
                return index;
            }
        }
        return -1;
    }
    //  actual_sum = 4 * (4+1)/2 = 4 * (2)= 6
    //  i = 0:  [1 2 4] sum = 1;
    //  i = 1:  [1 2 4] sum = 1+ 2 = 3
    //  i = 2:  [1 2 4] sum = 1+ 2+ 4= 7


    // Expected Solution
    // T(n) =
    private static int MissingNoMaths(int []ar){
        int n = ar.length;
        int sum = 0;
        int actual_sum = n * (n+1)/2;
        for (int i = 0; i < n-1; i++) {
            sum = sum + ar[i];
        }
        return actual_sum-sum;
    }
}
