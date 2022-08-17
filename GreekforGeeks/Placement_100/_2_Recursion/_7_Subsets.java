package com.company.Placement_100._2_Recursion;

public class _7_Subsets {
    public static void main(String[] args) {
        String str = "ABC";
        // not concerned about position
        // op = print all possible subsets
        printSubset(str,"",0);
    }
    // Naive Approach
    private static void printSubset(String str,String curr,int index) {
        // base case
        if (index == str.length()){
            System.out.print(curr + " ");
            return;
        }
        printSubset(str,curr,index + 1);
        printSubset(str,curr+str.charAt(index),index+1);
    }
}
