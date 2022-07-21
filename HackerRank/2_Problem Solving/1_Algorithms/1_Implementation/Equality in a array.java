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
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
    /*
    1 2 2 3
    1 - 1 
    2 - 2
    3 - 1
    2 op 
    
    3 3 2 1 3
    1 - 1
    2 - 1
    3 - 3
    op - 2
    
    1 2 3 1 2 3 3 3
    1 - 2
    2 - 2
    3 - 3
    
    
    count the elements which are having freq 1
    
    */
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.size();i++){
        if(map.containsKey(arr.get(i))){
            map.put(arr.get(i), map.get(arr.get(i))+1);
        }else{
            map.put(arr.get(i), 1);
        }
    }
    int max = 0;
    for(Map.Entry<Integer,Integer> i: map.entrySet()){
        
        if(max < i.getValue()){
            max = i.getValue();
        }
    }
    return arr.size()-max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
