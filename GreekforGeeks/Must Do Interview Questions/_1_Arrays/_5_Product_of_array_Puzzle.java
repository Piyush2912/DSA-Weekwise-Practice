package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class _5_Product_of_array_Puzzle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[]= {10,3,5,6,2};
        int ans[] = naive(nums);
        System.out.println(Arrays.toString(ans));
    }
    /*
    Naive approach
    find product of all no
    divide and them by no and place it in its position
    T(n) = O(n) and S(n) = O(1)
     */
    static int[] naive(int[] ar){
        int pr = 1;
        for (int i = 0; i < ar.length; i++) {
            pr = pr * ar[i];
        }
        for (int i = 0; i < ar.length; i++) {
            ar[i] = pr/ar[i];
        }
        return ar;
    }
    /*
    Efficient Optimised approach
    // to handle cases where 0 is element
    // to handle cases where there are two 0 element
    Step1: Find product of no.
            traverse array
                check if element == 0
                    increment count, set flag = true;
    Step2: Loop the array
               determine if element == product , replace element with 0
               determine if element ==0 ,  replace element with product
               determine else set ar[] = pr/ar[i]
    Step3: if flag == 1 (0 exist)
                loop array set every element as 0 except element 0
    Step4: if count>1 (two 0 exist)
                in this case set every element as 0
    Step5: return ans;
    T(n) = O(n), S(n) = O(1)

     */
    static long[] optimisedSolution(int ar[],int n){
        //Step1: finding product
        int pr =1;
        int count = 0;
        boolean flag = false;
        long ans[] = new long[n];
        for (int i = 0; i < n; i++) {
            // only positive consider
            if(ar[i] > 0){
                pr =pr*ar[i];
            }
            if (ar[i] == 0){
                count++;
                flag =true;
            }
        }

        // Traverse and set values appropriately
        for (int i = 0; i < n; i++) {
            if (ar[i] == pr )
                ans[i] = 0;
            else if (ar[i] == 0)
                ans[i] = pr;
            else
                ans[i] = pr/ar[i];
        }

        if (flag == true){
            for (int i = 0; i < n; i++) {
                if (ar[i] != 0)
                ans[i] = 0;
            }
        }
        if (count > 1){
            for (int i = 0; i < n; i++) {
                ans[i] = 0;
            }
        }
        return ans;

    }
}
