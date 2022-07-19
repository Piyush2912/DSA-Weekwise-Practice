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
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
    /*
    - advertise to exactly 5 people on social media
    - 1st Day -> 
        -Like the add = floor(no of people/2) 
        -Each shares it with 3 of their friends
    - 2nd Day: At the beggining, 
        -No of people to Receive the add = floor(no of people/2) * 3  
    - Each Day, Like the add = floor(No of people to recieve the add/2)
    - Each share with 3 friends
    - Assuming nobody recieves the add twice
    - Determine no of people liked the add by end of day
    - example
        Day 1: n =1
        sum= 0 // no of people liked?
         Shared: 5
         Liked = floor(5/2) = 2
         sum = sum + liked
         Day 2: n = 2
         Shared: 6
         Liked = floor(6/2) = 3
         sum = sum + liked = 2 + 3 = 5
         Day: 3
         Shared: 9 [ No of people liked * 3] = [3 * 3 ] = 9
         Liked: floor(9/2) = 4
         sum = sum + liked = 2 + 3 + 4 = 9
         Day 4:
         Shared: Liked*3 = 4*3 = 12
         Liked: floor(12/2) = 6
         sum = sum + liked = 9 + 6 = 15
         Day 5:
         Shared: Liked*3 = 6*3 = 18
         Liked: floor(18) = 9
         sum = sum + liked = 15 + 9 = 24
    */
    int sum = 0;
    int shared = 5;
    for(int i=1; i<=n; i++){
        int liked = (int)Math.floor(shared/2);
        sum = sum + liked;
        shared = liked * 3;
    }
    return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
