//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.oddEven(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String oddEven(int N){
        // code here
        /*
        1 0001 & 0001 = 1
        2 0010 & 0001 = 0
        3 0011 & 0001 = 1
        4 0100 & 0001 = 0
        5 0101 & 0001 = 1
        for even only 1 bit is set except 1 special case
        if there exist only 1 set bit then we can say number is even otherwise odd
        */
        return ((N&1) == 1) ? "odd":"even";
    }
}