import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        int idx = 0;
        for (String[] p : photo) {
            int sum = 0;
            for (String n : p) {
                sum += calScore(n, name, yearning);
            }
            answer[idx] = sum;
            idx++;
        }
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;

        }
        return answer;
    }

    int calScore(String pName, String[] name, int[] yearning) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(pName)) {
                return yearning[i];
            }
        }
        return 0;
    }
}