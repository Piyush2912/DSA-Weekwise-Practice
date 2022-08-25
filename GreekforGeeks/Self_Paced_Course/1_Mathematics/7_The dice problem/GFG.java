//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            int ans  = ob.oppositeFaceOfDice(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int oppositeFaceOfDice(int N){
        // code here
        // |6 - 6| + 1 = 1
        // |5 - 6| + 1 = 2
        // |4 - 6| + 1 = 3
        // |3 - 6| + 1 = 4
        // |2 - 6| + 1 = 5
        // |1 - 6| + 1 = 6
        return (Math.abs(N-6) + 1);
    }
}