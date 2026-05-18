import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        for (int i = charArr.length - 1; i >= 0; i--) {
            answer += charArr[i];
        }

        return answer;
    }
}