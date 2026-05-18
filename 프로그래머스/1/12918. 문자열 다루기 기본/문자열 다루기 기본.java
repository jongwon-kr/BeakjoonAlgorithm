import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;

        if (s.length() == 4 || s.length() == 6) {
            answer = isNumbers(s);
        }

        return answer;
    }

    boolean isNumbers(String s) {
        boolean result = true;
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            if (c >= '0' && c <= '9') {
                result = true;
            } else {
                return result = false;
            }
        }
        return result;
    }
}