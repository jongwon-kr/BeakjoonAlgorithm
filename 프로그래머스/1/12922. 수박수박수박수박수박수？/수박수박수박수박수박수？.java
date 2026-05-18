import java.util.*;
import java.io.*;

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 1) {
            return "수";
        }

        int evenCnt = n / 2;
        int rest = n % 2;

        for (int i = 0; i < evenCnt; i++) {
            sb.append("수박");
        }

        if(rest == 1) {
            sb.append("수");
        }

        return sb.toString();
    }
}