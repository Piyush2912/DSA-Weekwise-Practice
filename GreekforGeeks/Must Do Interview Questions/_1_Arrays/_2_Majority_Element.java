package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class _2_Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {3,1,3,3,2}; // op : 3
       //System.out.println(majorityElementNaive(ar));
       //System.out.println(MajorityElementNaiveApproach2(ar,ar.length));
        System.out.println(maximumElementEfficient(ar));
    }

    /*
    Clarify Question:
    [1] : -1
    [2,3,1,3] : 3
    [2,2,1,3,3]: 2

    Approach 1: Traverse the array in a loop
                traverse to find that array element by a loop
                    Count the freq starting from begining of every element
        T(n) = O(n^2)
        S(n) = O(1)
     */
    private static int majorityElementNaive(int[] ar) {
        int n = ar.length;

        for (int i = 0; i < n; i++) {
            int count =0;
            for (int j = 0; j < n; j++) {
                if (ar[i] == ar[j])
                    count++;
            }
            if (count > n/2){
                return ar[i];
            }
        }
        return -1;
    }
    /*
    Naive Approach 2:
        Use HashMap
            1. Map<int, int> key           value
                          ar element    freq
            1->. Traverse map find value where freq/ value > size/2;
                                            return key;

       T(n) = O(n)
       S(n) = O(n)
     */
    private static int MajorityElementNaiveApproach2(int ar[],int size){
        // base case
        if (size == 1){
            return ar[0];
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // Filling HashMap
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])){
                int count = map.get(ar[i]) +1;
                if (count > size/2){
                    return ar[i];
                }
                map.put(ar[i],count);

            }else{
                map.put(ar[i],1);
            }
        }
        // if element are distinct then O(n) time it will take
        return -1;
    }

    /*
    Efficient Code: Moore's Voting Algorithm
    Efficient Approach - Pairing of distinct element
    T(n) = O(n) , S(n) = O(1)
            1 1 1 2 3 4 1 6 1
            1-1
             X
            1- - -2
              1- - -3
                1- - -4
                        1-6
                            (1) Potential Candidate for MaximumElement
     1. Pairing of distinct element -> Potential candidate for maximum element
     2. Find freq of that potential candidate > size/2 then, Found Maximum element else, No Max element
1st iteration:
 index      0 1 2 3 4
            1 1 1 2 2
              i
 val= 1
 count=1

2nd iteration:
index       0 1 2 3 4
            1 1 1 2 2
                i
 val= 1
 count=2

3rd iteration:
index       0 1 2 3 4
            1 1 1 2 2
                  i
 val=  1
 count=3

4th iteration:
index       0 1 2 3 4
            1 1 1 2 2
                    i
 val=  1
 count=2

5th iteration:
index       0 1 2 3 4
            1 1 1 2 2
                    i
 val=  1
 count=1

     */
    static int maximumElementEfficient(int ar[]){
        // Potential Candidate for maximum element
        int valid = validCandidate(ar);

        // Find freq of valid candidate
        int freq = 0;
        for(int i=0; i< ar.length; i++){
            if (valid == ar[i]){
                freq++;
            }
        }

        // Check if it is Maximum element or not
        if (freq > ar.length/2){
            return valid;
        }else{
            return -1;
        }

    }
    static int validCandidate(int ar[]){
        int val = ar[0];
        int count = 1;
        // Loop from 2nd Element till end of array
        for (int i = 1; i < ar.length; i++) {
            if ( val == ar[i]){
                // No pairing
                count++;
            }else{
                // Pairing of distinct element
                count--;
            }
            if (count == 0){
                // if count becomes 0, we will give chance to current element
                val = ar[i];
                count = 1;
            }
        }
        return val;
    }

}
