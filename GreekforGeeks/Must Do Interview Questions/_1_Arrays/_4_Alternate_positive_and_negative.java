package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class _4_Alternate_positive_and_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        // Only this works
        System.out.println(Arrays.toString(naivePosNegRearrange(ar)));



        SpaceEfficientSolution(ar);
        System.out.println(Arrays.toString(ar));
        int ar1[] = {2 ,3 ,-4 ,-1 ,6, -9 };
        SpaceEfficient(ar1);
        System.out.println(Arrays.toString(ar1));
        int ar2[] = {2 ,3 ,-4 ,-1 ,6, -9 };
        spaceefficientordernotmaintaining(ar2);
        System.out.println(Arrays.toString(ar2));
    }

    /*
    Clarify Question:
    ar[] = [1] op=> 1
    ar[] = [2,-1] op=> 2,-1
    ar[] = []

    Naive Approach:
    1. Create an two ArrayList positive and negative
    2. loop from beg of array to end
    3.      if(no is pos)=> add it in arraylist pos
            if(no is neg)=> add it in arraylist neg
    4. loop from beg till end
        1). if (index is even)=> fill up pos no, remove no from arraylist pos
        2). if (index is odd)=> fill up neg no, remove no from arraylist neg
        3). If any arraylist become empty => stop loop
    5. Create while loops to fill the rest of members of the subciquent arraylist
    6. Return array ans

     T(n) = O(n), S(n) = O(n)
     */

    private static int[] naivePosNegRearrange(int[] ar) {
        // Step 1: Create temp dynamic array to store pos and neg no
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();

        // Step 2: Taking variables to count the length of element in both arrays
        for (int i = 0; i < ar.length; i++) {
            //finding positive element
            if (ar[i] >= 0){
                pos.add(ar[i]);
            }else{
                // neg element
                neg.add(ar[i]);
            }
        }
        // System.out.println(Arrays.toString(pos.toArray()));
        // System.out.println(Arrays.toString(neg.toArray()));

        //Step 3: Traverse the array
        int i=0,x = 0,y = 0;
        for ( i = 0; i < ar.length; i++) {

            if (x == pos.size() || y==neg.size()){
                break;
            }
            if (i%2 == 0){
                // if it is even put pos, remove from pos
                ar[i] = pos.get(x);
                x++;
            }else{
                // index is odd, put neg, remove from neg
                ar[i] = neg.get(y);
                y++;
            }
        }
        //Step 4: Filling remaining elements
        while ( x < pos.size()){
            ar[i] = pos.get(x);
            x++; i++;
        }
        while ( y < neg.size()){
            ar[i] = neg.get(y);
            y++; i++;
        }
        // Step 5: Return ans
        return ar;
        }
    /*
    Space Efficient Solution : Naive Approach
    1. Traverse array from left to right
    2. Find elements which are out of place,
        1. if pos element at odd pos
        2. if neg element at even pos
    3. After finding out of place element we replace it with the next opposite sign element-> right rotation
    4. We rotate the sub array between cur and outofplace element

    T(n^2) S(1)


int ar[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
 index: 0 1  2  3 4 5  6  7 8
 values:9 -2 4 -1 5 -5 0 -3 2
   i=0: i                           outofplace = -1
   i=1:   i                         outofplace = 1
   i=2:      i                      outofplace = -1 => rightrotation(sub array)=> [4,-2] -> [-2,4]
   i=3:         i                   outofplace = -1
   i=4:           i                 outofplace = -1
   i=5:             i               outofplace = 5 => rightrotate(sub array)=> [0,-5] -> [-5,0]
   i=6:                i            outofplace = -1
   i=7:                   i         outofplace = -1
   i=8:                     i       outofplace = -1

   Output array: [9,-2,4,-1,5,-5,0,-3,2]
     */

    static void rightrotate(int ar[],int outofplace,int curr){
        int temp = ar[curr];
        for (int i = curr; i > outofplace ; i--) {
            ar[i] = ar[i-1];
        }
        ar[outofplace] = temp;
    }
    static void SpaceEfficientSolution(int ar[]){
        // initialise outofplace with -1
        int outofplace = -1;

        // traverse array from left to right
        for (int index = 0; index < ar.length; index++) {
            //  if element is out place then,
            if (outofplace >= 0){
                //
                if (ar[index] >= 0 && ar[outofplace] < 0 || ar[index] < 0 && ar[outofplace] >=0){
                    rightrotate(ar,outofplace,index);
                }

                // the new out of place element is 2 steps ahead
                if (index - outofplace >= 2){
                    // set out of place to its correct position
                    outofplace = outofplace + 2;
                }else{
                    // set it to default
                    outofplace = -1;
                }
            }

            // check if element is out of place
            if(outofplace == -1){
                // incorrect elements identify
                if ((ar[index] >= 0 && index%2!=0) || (ar[index] <0 && index%2==0)){
                    outofplace = index;
                }
            }
        }
    }

    /*
    Space Efficient Solution:
    T(n*logn) S(1)
    Approach:
    1. Sort the array in increasing order,
    2. Check if count(neg_elements) > count(pos_element))
        fill1()
            1. loop 1 se n tk with +2 increment
            2. check krega if neg count is odd or even then process it accordingly
        fill2() if count(neg element) < count(positive element)
            reverse sorted array()
            1. loop 1 se n tk with +2 increment
            2. check if pos count is odd or even then process it accordingly
     */
    static void SpaceEfficient(int ar1[]) {
        // Step1: Sort the array
        int n = ar1.length;
        int neg = 0, pos = 0;
        for (int i = 0; i < n; i++) {
            if (ar1[i] < 0)
                neg++;
            else
                pos++;
        }
        // Sort the array
        Arrays.sort(ar1);

        if (neg <= pos) {
            fill1(ar1, neg, pos);
        }
        else {
            // reverse the array in this condition
            reverse(ar1, n);
            fill2(ar1, neg, pos);
        }
    }
    static void fill1(int a[], int neg, int pos)
    {
        if (neg % 2 == 1) {
            for (int i = 1; i < neg; i += 2) {
                int c = a[i];
                int d = a[i + neg];
                int temp = c;
                a[i] = d;
                a[i + neg] = temp;
            }
        }
        else {
            for (int i = 1; i <= neg; i += 2) {
                int c = a[i];
                int d = a[i + neg - 1];
                int temp = c;
                a[i] = d;
                a[i + neg - 1] = temp;
            }
        }
    }
    // function which works in the condition when number of
    // negative numbers are greater than positive numbers
    static void fill2(int a[], int neg, int pos)
    {
        if (pos % 2 == 1) {
            for (int i = 1; i < pos; i += 2) {
                int c = a[i];
                int d = a[i + pos];
                int temp = c;
                a[i] = d;
                a[i + pos] = temp;
            }
        }
        else {
            for (int i = 1; i <= pos; i += 2) {
                int c = a[i];
                int d = a[i + pos - 1];
                int temp = c;
                a[i] = d;
                a[i + pos - 1] = temp;
            }
        }
    }
    static void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
/*
Approach:
    T(n) = O(n) and S(n) = O(1)
    1. Solve it in O(n) and S(1)
    2. Idea  is to solve put all negative in right end in O(n) time
    3. After this, we can easily arrange in alternative pos and neg by swap
    4. We swap next pos element at even pos from next neg element in this step.

 */
    private static void spaceefficientordernotmaintaining(int[] ar2) {
    // O(n) time for shifting all -ve elements to the end of array/
        // shift all -ve
        int n = ar2.length;
        int i=0,j= n-1;
        while(i < j){
            while (i <= n - 1 && ar2[i] > 0)
                i++;
            while (j >= 0 && ar2[j] < 0)
                j--;
            if (i < j){
                swaphere(ar2,i,j);
            }
        }
        // i has leftmost negative element
        if (i ==0 || i ==n)
            return;

        // rearrange
        int k = 0;
        while(k < n && i < n){
            // swap next positive with even from next negative element
            swaphere(ar2,k,i);
            i++;
            k+=2;
        }

    }

    static void swaphere(int ar2[],int i,int j){
        int temp = ar2[i];
        ar2[i] = ar2[j];
        ar2[j] = temp;
    }

}

