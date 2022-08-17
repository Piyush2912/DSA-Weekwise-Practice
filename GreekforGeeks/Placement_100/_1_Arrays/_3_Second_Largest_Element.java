package com.company.Placement_100._1_Arrays;

public class _3_Second_Largest_Element {
    public static void main(String[] args) {
        int ar[] = {20,20,9,1,2};
        System.out.println(naive(ar));
        System.out.println(efficient2ndLargest(ar));
    }
    // O(n) time complexity where we iterate two times
    private static int naive(int[] ar) {
        int largest = get1stLargest(ar);
        // initializing result as -1 because we can have a case where do not find 2nd largest
        // 10 10 10
        // op = -1
        int res = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != ar[largest]){
                if (res == -1 ){
                    res = i;
                }else if (ar[i] > ar[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    private static int get1stLargest(int[] ar) {
        int largest = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[largest] < ar[i]){
                largest = i;
            }
        }
        return largest;
    }

    // EFFICIENT SOLUTION
    // a0 a1 a2 . . . .  ai-1 ai
    // idea is
    //  5 10 20 6
    //  largest =0 , res = -1
    //  loop from 1 to n
    //      if a[largest] < ar[i]
    //          res = largest
    //          largest = i;
    //      else if ( ar[i] != ar[largest]){
    //          if (res == -1 || ar[res] < ar[i])
    //                  res = i;
    //   return res

    private static int efficient2ndLargest(int ar[]){
        int res = -1, largest = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[largest] < ar[i]){
                res = largest;
                largest = i;
            }else if (ar[largest] != ar[i]){
                if (res == -1 || ar[res] < ar[i]){
                    res = i;
                }
            }
        }
        return res;
    }
}
