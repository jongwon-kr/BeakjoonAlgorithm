import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int tempV = max;
        while (true) {

            boolean checkMultiple = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (tempV % arr[i] != 0) {
                    checkMultiple = false;
                }
            }
            if (checkMultiple) {
                answer = tempV;
                break;
            }
            tempV += max;
        }
        return answer;
    }
}