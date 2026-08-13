import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String[][] ts) {

        List<String> result = new ArrayList<>();
        Map<String, PriorityQueue<String>> map = new HashMap<>();

        for (String[] t: ts) {
            map.putIfAbsent(t[0], new PriorityQueue<>());
            map.get(t[0]).add(t[1]);
        }

        dfs(result, map, "ICN");

        String[] answer = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }

    public void dfs(List<String> result, Map<String, PriorityQueue<String>> map, String from){

        while(map.containsKey(from) && !map.get(from).isEmpty()){
            String str = map.get(from).poll();
            dfs(result, map, str);
        }

        result.add(0, from);
    }
}