import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] ops) {
        PriorityQueue<Integer> ascPq = new PriorityQueue<>();
        PriorityQueue<Integer> descPq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < ops.length; i++){
            String o = ops[i].split(" ")[0];
            int value = Integer.parseInt(ops[i].split(" ")[1]);
            
            if(o.equals("I")){
                ascPq.add(value);
                descPq.add(value);
            } else if(!ascPq.isEmpty() && !descPq.isEmpty()) {
                
                if(value == 1){
                    ascPq.remove(descPq.poll());
                } else if(value == -1) {
                    descPq.remove(ascPq.poll());
                }
            }
        }
        int max = 0, min = 0;
        if(!ascPq.isEmpty()){
            min = ascPq.poll();
        }

        if(!descPq.isEmpty()){
            max = descPq.poll();
        }
        int[] answer = new int[]{max, min};
        return answer;
    }
}