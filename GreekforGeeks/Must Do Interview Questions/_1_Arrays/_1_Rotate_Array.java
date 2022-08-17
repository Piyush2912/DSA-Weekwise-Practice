package com.company.V_V_V_IMP_Must_Do_Interview_Questions_for_Product_based_companies.Easy._1_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class _1_Rotate_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ar[] = {1,2,3,4,5};
        int d = 2;
        //rotateAntiClockwise(ar,d);
        System.out.println(Arrays.toString(ar));
        int ar1[] = {1,2,3,4,5};

        // RotateEfficiently TO LEFT/ Counter Clokwise
        // V.V.V. IMP STEP
        d = ar.length - d;
        rotateEfficiently(ar1,d);
        // d = 5 - 2 = 3 rotations RR => [1,2,3,4,5] => [3,4,5,1,2]

        // WORKS FOR RIGHT ROTATION/ CLOCKWISE
        //rotateEfficiently(ar1,d);
        System.out.println(Arrays.toString(ar1));
    }

    /*
    Clarify Question:
    ar = [1,2,3,4,5], d=2 : [3,4,5,1,2]

    what happens when d=1 : [2,3,4,5,1]
    what happens when d=n : [1,2,3,4,5] => do nothing
    what happens when d=6 : [2,3,4,5,1] => (until d <= n) do if(d > n) => d =(d-n);

    Approach:
    start
    if (d == n) return;
    //                      Improved VERSION
    if (d > n) {            d = d % n;
            d = d -n;
        }
    }                       if (d < 0){
                                d = d + n;
                            }
    //
    int n = ar.length;

    for(int i = 1; i <= d; i++ ){
        for(int low = 0; low< n-1; low++){
            int high = low + 1;
            swap(low,high);
            high++;
        }
    }

    // swap function:
    void swap(int ar[],int low, int high){
        int temp = ar[low];
        ar[low] = ar[high];
        ar[high] = temp;
    }
     */
    /*
    T(n) = O (n^2)
    S(n) = O (1)
     */
    private static void rotateAntiClockwise(int[] ar, int d) {
        int n = ar.length;

        if (d == n) return;
        // preprocessing d d = d % n => d = d+m if(d<0)
        if (d > n){
            while (d > n){
                d = d-n;
            }
        }
        // no of times we have to rotate
        for (int i = 1; i <= d ; i++) {
            for (int low = 0; low < n - 1; low++) {
                int high = low + 1;
                swap(ar, low, high);
                high++;
            }
        }
    }
    static void swap(int ar[],int low,int high){
        int temp = ar[low];
        ar[low] = ar[high];
        ar[high] = temp;
    }

    // EFFICIENT SOLUTION
    /*

    // ROTATE AN ARRAY BY PEP CODING
    /*
    [1,2,3,4,5], d=2; : [Part 1 | Part 2]  : [1,2,3 | 4,5] =>
                        [Part 1'| Part 2'] : [3,2,1 | 5,4] =>
                        [Part 1 | Part 2]' : [4,5,1,2,3]
     */
    static void rotateEfficiently(int ar[],int d){
        // Edge cases
        d = d % ar.length;
        if (d < 0){
            d = d + ar.length;
        }
        //Part1     0   5-2-1=2
        reverse(ar,0,ar.length - d - 1);
        //Part2     5-2=3           5-1=4
        reverse(ar,ar.length - d, ar.length - 1);
        System.out.println(Arrays.toString(ar));

        //All       0       4
        reverse(ar,0,ar.length-1);

    }
    static void reverse(int ar[],int i,int j){
        int i1 = i;
        int i2 = j;
        while(i1 < i2){
            int temp = ar[i1];
            ar[i1] = ar[i2];
            ar[i2] = temp;

            i1++;
            i2--;
        }
    }
}
