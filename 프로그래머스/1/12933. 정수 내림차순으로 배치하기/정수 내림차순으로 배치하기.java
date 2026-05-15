import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        String[] sArr = String.valueOf(n).split("");

        Arrays.sort(sArr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : sArr) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }
}