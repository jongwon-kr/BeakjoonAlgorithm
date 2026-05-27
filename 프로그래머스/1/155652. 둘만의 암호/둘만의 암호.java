import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        char[] sCharArr = s.toCharArray();

        for (char c : sCharArr) {
            sb.append(decryption(c, skip, index));
        }

        return sb.toString();
    }

    char decryption(char c, String skip, int idx) {
        char current = c;
        int stepCount = 0;

        while (stepCount < idx) {
            current++;
            if (current > 'z') {
                current -= 26;
            }
            if (!skip.contains(String.valueOf(current))) {
                stepCount++;
            }
        }
        return current;
    }
}