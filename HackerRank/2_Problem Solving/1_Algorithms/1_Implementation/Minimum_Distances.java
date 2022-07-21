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
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
    // Write your code here
    // 7 1 3 4 1 7
    /* 0 1 2 3 4 5 
    
        7 0
        1 1
        3 2
        4 3
        1       c = 4, p = 1, minDis = 4-1=3
        7       c = 5, p = 0, minDis = 5-0=5 => 3
        
            
    */
        int minDis = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        int prev_index = 0, cur_index = 0;
        for(int i=0; i <a.size(); i++){
            if (map.containsKey(a.get(i))){
                cur_index = i;
                prev_index = map.get(a.get(i));
                minDis = Math.min(Math.abs(cur_index-prev_index),minDis);
                System.out.println(minDis);
            }
            map.put(a.get(i),i);
        }
        return (minDis == Integer.MAX_VALUE) ? -1:minDis;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
