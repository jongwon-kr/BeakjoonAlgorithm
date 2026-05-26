import java.util.*;
import java.io.*;

class Solution {
    public String solution(int a, int b) {
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int totalDays = 0;
        for (int i = 1; i < a; i++) {
            totalDays += months[i];
        }
        totalDays += b;
        return days[totalDays % 7];
    }
}