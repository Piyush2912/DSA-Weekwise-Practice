import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        java.util.Map<Character,Integer> map = new java.util.HashMap<Character,Integer>();
        for(int i=0; i<b.length(); i++){
            Character ch = b.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<a.length(); i++){
            char ch = a.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }else{
                map.put(ch, map.get(ch) - 1);
            }
            
            Integer freq = map.get(ch);
            if(freq < 0){
                return false;
            }
        }
        return true;
        
    }

  public static void main(String[] args) {