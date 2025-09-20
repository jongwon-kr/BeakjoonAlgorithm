import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String[][] ts) {
        String[] answer = {};
        
        List<String> result = new ArrayList<>(Arrays.asList(answer));
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        
        for(int i = 0; i < ts.length; i++){
            map.putIfAbsent(ts[i][0], new PriorityQueue<>());
            map.get(ts[i][0]).add(ts[i][1]);
        }
        
        
        dfs(result, map, "ICN");
    
        answer = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    public void dfs(List<String> result, Map<String, PriorityQueue<String>> map, String from){
        
        while(map.containsKey(from) && !map.get(from).isEmpty()){
            String str = map.get(from).poll();
            System.out.println("str: " + str);
            dfs(result, map, str);
        }
        
        result.add(0, from);
    }
}