import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i : array){
            list.add(i);
        }
        
        for(int[] com : commands){
            int a = com[0], b = com[1], k = com[2];
            List<Integer> temp = new ArrayList<>();
            for(int i = a - 1; i < b; i++){
                temp.add(list.get(i));
            }
            Collections.sort(temp);
            result.add(temp.get(k - 1));
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}