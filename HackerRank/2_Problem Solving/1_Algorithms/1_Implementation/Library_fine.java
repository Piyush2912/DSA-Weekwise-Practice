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
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */

    public static int libraryFine(int ad, int am, int ay, int ed, int em, int ey) {
    // Write your code here
    /*
    - Given the expected and actual return dates for a library book
    - create a program that calculates the fine (if any).
    - 
    if(date of book return < return date of book )fine =0;
    if(same year and same month day is moredate of book return > return date of book) fine = 15 * (No of days late)
    if(same year but different month date of book return > return date of book) fine = 500 * (number of month late)
    if(book returned after year) fine = 10000
    Jan 1, 2017 or December 31, 2017
    
    */
    int charge = 0;
    // 
    if(ay == ey){
        if(am == em){
           charge = 15 * Math.abs(ad - ed);
           if(ad <= ed){
                charge = 0;
            }
        }    
        else if(am > em){
            charge = 500 * Math.abs(am-em);
        }
        // else{
        //         charge =0;
        //     }
    }else if(ay > ey){
        charge = 10000;
    }
    
    return charge;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d1 = Integer.parseInt(firstMultipleInput[0]);

        int m1 = Integer.parseInt(firstMultipleInput[1]);

        int y1 = Integer.parseInt(firstMultipleInput[2]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d2 = Integer.parseInt(secondMultipleInput[0]);

        int m2 = Integer.parseInt(secondMultipleInput[1]);

        int y2 = Integer.parseInt(secondMultipleInput[2]);

        int result = Result.libraryFine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
