import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] p, String[] c) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for(String s : p){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for(String s : c){
            if(map.get(s) == 1){
                map.remove(s);
            }else{
                map.put(s, map.get(s) - 1);
            }
        }
        
        for(String k : map.keySet()){
            answer = k;
        }
        
        return answer;
    }
}