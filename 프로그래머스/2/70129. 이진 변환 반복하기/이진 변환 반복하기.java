import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String s) {

        int[] result = new int[2];

        while(!s.equals("1")) {
            char[] chars = s.toCharArray();
            for(char c : chars) {
                if(c == '0'){
                    result[1]++;
                }
            }
            s = s.replaceAll("0", "");
            s = getBinary(s.length());
            result[0]++;
        }
        return result;
    }

    private String getBinary(int n) {
        String result = "";

        while(n > 1) {
            result = String.valueOf(n % 2) + result;
            n /= 2;
        }

        result = String.valueOf(n) + result;
        return result;
    }
}