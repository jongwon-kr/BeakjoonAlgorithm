import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] babbling) {
        String[] bal = {"aya", "ye", "woo", "ma"};
        String[] balbal = {"ayaaya", "yeye", "woowoo", "mama"};
        int answer = 0;

        for (String str : babbling) {
            boolean isRepeat = false;
            for (String bb : balbal) {
                if (str.contains(bb)) {
                    isRepeat = true;
                }
            }
            if (isRepeat) continue;

            String result = str;
            for (String b : bal) {
                result = result.replace(b, " ");
            }
            result = result.replace(" ", "");
            if (result.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}