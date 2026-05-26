import java.util.*;
import java.io.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int idx = 1;
        for (int i = 0; i < food.length; i++) {
            int f = food[i];
            int eCnt = f / 2;
            if (eCnt > 0) {
                for (int j = 0; j < eCnt; j++) {
                    sb.append(i);
                    sb2.insert(0, i);
                }
            }
        }
        sb.append("0");
        sb.append(sb2.toString());
        return sb.toString();
    }
}