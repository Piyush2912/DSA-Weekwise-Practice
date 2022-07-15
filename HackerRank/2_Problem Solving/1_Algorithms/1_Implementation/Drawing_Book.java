import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
       /*
       front way or back way
       -1 page at a time
       -page 1 is always on right side
       -even page on left side and odd page on right side of book
       -last page on both sides always -> left and right last page is same -> odd ke case m 1 right side
       -last page may only be printed on the front -> even page m 2 p hoga
       -book n pages long
       -student want to turn p page
       =find min no of pages to turn
       -two ways
       
       -case 1: front way: if( p <= n/2)
                    -case 1: corner case
                        = if(n == 1) return 1;
                    -case 2: average case
                        = start = 1, count = 0;
                        =while(start <= p) start += 2 count++; 
                    -case 3: 2nd corner case
                        = if(n == 10,00,000 && p == n) return 0;
       -case 2: back way: if(p > n/2)
            -case i:  no of pages odd 
                    -case 1: corner case
                        = if(n == p) return 0;
                    -case 2: average case
                        =start = n; count = 0;
                        = while(start >= p) start -= 2; count++;
            -case ii: no of pages even
                    -case 2: average case
                        = start = n-1, count = 1
                        = while(start >= p) start -= 2; count++;   
       */
        // if(n == 1 || n == p){ return 0;}
        // int start = 1,count = 0;
        // if(p <= (n/2)){
        //         while(start <= p){
        //             start += 2;
        //             count++;
        //         }
        //         return count;
        // }else{
        //     if(n%2 != 0){
        //         if(p == n-1){
        //             return 0;
        //         }
        //         start = n;
        //         count = 0;
        //         while(start > p){
        //             start -= 2;
        //             count++;
        //         }    
        //         return count;    
        //     }else{
        //         start = n-1;
        //         count = 1;
        //         while(start >= p){
        //             start -= 2;
        //             count++;
        //         }
        //         return count;
        //     }
        // int beg =0;
        // int end = n;
        // int mid = (beg+end)/2;
        // int count = 0;
        // while (beg <= end){
        //     count++;
        //     if (mid == p){
        //         return count;
        //     }else if (mid < p){
        //         beg = mid +1;
        //     }else{
        //         end = mid -1;
        //     }
        // }
        // return 0;
        // }
    return Math.min(p/2,(n/2)-(p/2));
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

