import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] ar) {
        int sum = -63;
        //ar[0][0] + ar[0][1] + ar[0][2] + ar[1][1] + ar[2][0] + ar[2][1] + ar[2][2]
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int up = ar[i][j] + ar[i][j+1] + ar[i][j+2];
                int mid = ar[i+1][j+1];
                int low = ar[i+2][j] + ar[i+2][j+1] + ar[i+2][j+2];

                int add = up + mid + low;
                if (sum < add){
                    sum = add;
                }
            }
        }
        return sum;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
