import java.util.*;
import java.io.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int fCnt = 0;
        int sCnt = 0;
        char tempC = '#';

        for (int i = 0; i < s.length(); i++) {
            if (tempC == '#') {
               tempC = s.charAt(i);
               fCnt++;
               continue;
            }

            if (tempC == s.charAt(i)) {
                fCnt++;
            } else {
                sCnt++;
            }

            if (fCnt == sCnt) {
                answer++;
                fCnt = 0;
                sCnt = 0;
                tempC = '#';
            }
        }
        if (fCnt != 0 || sCnt != 0) {
            answer++;
        }

        return answer;
    }
}