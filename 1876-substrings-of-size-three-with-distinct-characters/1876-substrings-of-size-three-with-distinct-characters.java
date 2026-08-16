import java.util.*;

class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> freq= new HashMap<>();
        
        int l =0 ;
        int count =0;
        
        for(int r =2; r<  s.length(); r++){
            
            for(int i= l; i<=r; i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
            
        }
        if(freq.size() ==3){
            count++;
        }
        freq.clear();
        l++;}
        
        return count;
    }
}