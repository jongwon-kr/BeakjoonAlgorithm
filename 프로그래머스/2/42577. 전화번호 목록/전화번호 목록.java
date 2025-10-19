import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String[] pb) {
        boolean answer = true;
        Arrays.sort(pb);
        
        for(int i = 0; i < pb.length - 1; i++){
            if(pb[i+1].indexOf(pb[i]) == 0){
                answer = false;
            }
        }
        
        return answer;
    }
}