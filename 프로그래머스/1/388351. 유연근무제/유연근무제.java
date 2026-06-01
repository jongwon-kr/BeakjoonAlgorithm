import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int lateCnt = 0;

        for (int i = 0; i < schedules.length; i++) {
            int goalTime = schedules[i];
            int h = goalTime / 100;
            int m = goalTime % 100 + 10;
            if (m >= 60) {
                h++;
                m -= 60;
            }
            int limitTime = h * 100 + m;

            for (int j = 0; j < 7; j++) {
                int curDay = (startday + j - 1) % 7 + 1;

                if (curDay == 6 || curDay == 7) {
                    continue;
                }
                int temp = timelogs[i][j];
                if (temp > limitTime) {
                    lateCnt++;
                    break;
                }
            }
        }
        return schedules.length - lateCnt;
    }
}