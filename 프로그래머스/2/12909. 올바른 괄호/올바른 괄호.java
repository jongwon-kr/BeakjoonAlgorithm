import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        ArrayDeque<Character> adq = new ArrayDeque<>();
        // '('일 경우 push, ')'일 경우 pop 하면될듯
        for (char c : s.toCharArray()) {
            if (c == '(') {
                adq.push(c);
            } else if (c == ')') {
                if (!adq.isEmpty() && adq.peek() == '(') {
                    adq.pop();
                    continue;
                }
                adq.push(c);
            }
        }
        
        if (adq.size() == 0) {
            answer = true;
        }
        
        return answer;
    }
}