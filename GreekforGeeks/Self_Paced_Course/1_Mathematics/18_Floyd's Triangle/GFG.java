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
            int N = sc.nextInt();

            Solution ob = new Solution();
            ob.printFloydTriangle(N);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printFloydTriangle(int n){
        // code here
        int count = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i >= j){
                    System.out.print(count+" ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}