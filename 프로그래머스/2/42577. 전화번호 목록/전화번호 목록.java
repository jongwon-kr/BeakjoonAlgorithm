import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String[] pb) {
        boolean result = true;
        Arrays.sort(pb);
        
        for (int i = 0; i < pb.length - 1; i++) {
            if (pb[i + 1].startsWith(pb[i])) {
                result = false;
            }            
        }
        
        return result;
    }
}