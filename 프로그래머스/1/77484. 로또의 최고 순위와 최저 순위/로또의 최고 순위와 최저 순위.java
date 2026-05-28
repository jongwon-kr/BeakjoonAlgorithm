import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zCnt = 0;
        int winCnt = 0;

        for (int i : lottos) {
            if (i == 0) {
                zCnt++;
            } else {
                for (int j : win_nums) {
                    if (i == j) {
                        winCnt++;
                    }
                }
            }
        }

        if (winCnt == 6) {
            answer[0] = 1;
            answer[1] = 1;
        } else if (winCnt == 5) {
            answer[0] = 2 - zCnt;
            answer[1] = 2;
        } else if (winCnt == 4) {
            answer[0] = 3 - zCnt;
            answer[1] = 3;
        } else if (winCnt == 3) {
            answer[0] = 4 - zCnt;
            answer[1] = 4;
        } else if (winCnt == 2) {
            answer[0] = 5 - zCnt;
            answer[1] = 5;
        } else if (winCnt == 1) {
            answer[0] = 6 - zCnt;
            if (zCnt == 5) {
                answer[0] = 1;
            }
            answer[1] = 6;
        } else if (winCnt == 0) {
            answer[0] = 6 - zCnt;
            if (zCnt == 6) {
                answer[0] = 1;
            }
            answer[1] = 6;
        }

        return answer;
    }
}