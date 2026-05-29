import java.util.*;
import java.io.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (int i = 0; i < X.length(); i++) {
            char c = X.charAt(i);
            int num = check(c);
            int ci = c - 48;
            xArr[ci]++;
        }

        for (int i = 0; i < Y.length(); i++) {
            char c = Y.charAt(i);
            int num = check(c);
            int ci = c - 48;
            yArr[ci]++;
        }

        boolean onlyZero = true;
        int cnt = 0;
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(xArr[i], yArr[i]);
            if (min > 0) {
               cnt++;
            }

            if (i != 0 && min > 0) {
                onlyZero = false;
            }

            for (int j = 0; j < min; j++) {
                sb.append(""+ i);
            }
        }

        answer = sb.toString();
        if (onlyZero) {
            answer = "0";
        }

        if (cnt == 0) {
           answer = "-1";
        }
        return answer;
    }

    int check(char c) {
        int result = 0;
        switch (c) {
            case '0':
                result = 0;
                break;
            case '1':
                result = 1;
                break;
            case '2':
                result = 2;
                break;
            case '3':
                result = 3;
                break;
            case '4':
                result = 4;
                break;
            case '5':
                result = 5;
                break;
            case '6':
                result = 6;
                break;
            case '7':
                result = 7;
                break;
            case '8':
                result = 8;
                break;
            case '9':
                result = 9;
                break;
        }
        return result;
    }
}