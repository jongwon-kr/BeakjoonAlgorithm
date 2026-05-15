import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        int idx = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(idx) - 48;
            idx--;
        }

        return answer;
    }
}