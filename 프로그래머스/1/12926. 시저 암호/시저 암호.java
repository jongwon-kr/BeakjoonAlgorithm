import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            int asc = c + n;
            if (c >= 'a' && c <= 'z') {
                if (asc > 122) {
                    asc -= 26;
                }
                sb.append((char) asc);
            } else if (c >= 'A' && c <= 'Z') {
                if ((char) asc > 90) {
                    asc -= 26;
                }
                sb.append((char) asc);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}