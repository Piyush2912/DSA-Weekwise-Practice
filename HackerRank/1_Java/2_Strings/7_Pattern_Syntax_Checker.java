import java.io.*;
import java.util.*;
// need to insert regex lib so it has Pattern.compile method
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine(); // IMP: gets rid of the pesky newline.
        while (testCases-- > 0){
           String pattern = scan.nextLine();
           try {
               Pattern.compile(pattern);
               System.out.println("Valid");
           } catch (PatternSyntaxException exception) {
               System.out.println("Invalid");
           }
        }
        scan.close();
    }
}