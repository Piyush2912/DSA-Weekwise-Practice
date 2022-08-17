package com.company.Placement_100._2_Recursion;

public class _4_Pallindrome {
    public static void main(String[] args) {
        String str = "abcba";
        // op yes ya no
        System.out.println(isPallindrome(str,0,str.length()));
    }
    //  T(n) = O(n)
    //  S(n) = O(n)
    private static boolean isPallindrome(String str,int start,int end) {
        // base condition
        if (start <= end)
            return true;
        // char at start and end same hona chaiye
        // && isPallindrome(str,start+1,end-1)
        return str.charAt(start) == str.charAt(end) && isPallindrome(str,start+1,end-1);
    }
}
