/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt(){ return Integer.parseInt(next()); }
        long nextLong(){ return Long.parseLong(next()); }
        double nextDouble(){ return Double.parseDouble(next()); }
        String nextLine(){
            String str="";
            try{
                if(st.hasMoreElements()){
                    str = st.nextToken("\n");
                }else{
                    str = br.readLine();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader s = new FastReader();
	    int n = s.nextInt();
	    if(n >= 750){
	        System.out.println("YES");
	    }else{
	        System.out.println("NO");
	    }
	    
	}
	
}
