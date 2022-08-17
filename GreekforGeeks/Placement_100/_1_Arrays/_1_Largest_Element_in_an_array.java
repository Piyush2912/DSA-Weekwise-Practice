package com.company.Placement_100._1_Arrays;

public class _1_Largest_Element_in_an_array {
    public static void main(String[] args) {
        int ar[] = {10,10,10,10};
        System.out.println(naive(ar));
        System.out.println(EfficientgetLargest(ar));
    }
    // O(n2)
    // where i will iterate in two loop starting from 0 to n
    // and will compare every possible case with every other element
    // NOT RUNNABLE
    private static int naive(int[] ar) {//
      // 10 23 18 5
      // i=0: flag = true
      int n = ar.length,i = 0;
      boolean flag = false;
      for (i=0;i<n;i++){
          for (int j = 0; j < n; j++) {
              if (ar[i] < ar[j]){
                  flag = true;
                  break;
              }
          }
      }
      if (flag)
          return i;
      return -1;
    }

    /*
    EFFICIENT APPROACH - O(n)
    iterate only once
    set the 1st element as the largest element and see if any other element is largest then we update it
    a0 a1 a2 ..... ai-1 ai ai+1.... an-1 an
                    largest = 0
                    finds largest as ai+1
                    set largest = i+1
     */
    private static int EfficientgetLargest(int ar[]){
        int res = 0;
        for(int i=0;i<ar.length;i++){
            if (ar[i] > ar[res])
                res = i;
        }
        return res;
    }
}
