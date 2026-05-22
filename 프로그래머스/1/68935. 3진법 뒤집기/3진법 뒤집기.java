import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String tStr = convertToThree(n);
        int temp = 1;
        for (int i = tStr.length() - 1; i >= 0; i--) {
            int j = tStr.charAt(i);
            answer = answer + ((j - 48) * temp);
            temp *= 3;
        }

        return answer;
    }

    private String convertToThree(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int n1 = n % 3;
            n /= 3;
            sb.append(String.valueOf(n1));
        }
        return sb.toString();
    }
}