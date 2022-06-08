package com.company.DSA_450;
import java.util.Scanner;
public class _Array_Max_Min_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long max = 0;
        long min = Integer.MAX_VALUE;
        long n;
        n = 100;
        long a[] = new long[(int) n];
    }
        static pair getMinMax(long a[], long n)
        {
            //Write your code here
            long max = 0;
            long min = Integer.MAX_VALUE;
            for(long i = 0; i < n; i++){
                if(a[(int)i] < min){
                    min  = a[(int)i];
                }
                if(a[(int)i] > max){
                    max = a[(int)i];
                }
            }
            pair p= new pair(min,max);
            return p;
        }
    }
    class pair
    {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
