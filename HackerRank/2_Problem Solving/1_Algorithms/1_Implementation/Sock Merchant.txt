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
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
//     // 9
//      10 20 20 10 10 30 50 10 20
    //  10 4
    /*  20 3
        30 1
        50 1
        
        4-> 2
        3-> 1
        
    
    
    
    */
        java.util.Map<Integer,Integer> map = new java.util.HashMap<>();
        for(int i=0;i< n; i++){
            if(map.containsKey(ar.get(i))){
                map.put(ar.get(i), map.get(ar.get(i)) + 1);
            }else{
                map.put(ar.get(i),1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            if(i.getValue() > 1){
                count += i.getValue()/2;
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
