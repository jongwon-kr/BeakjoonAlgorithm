import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] people, int limit) {
        int bCnt = 0;
        int left = 0;
        int right = people.length - 1;
        Arrays.sort(people);
        while (left <= right) {
            bCnt++;
            if (people[left] + people[right] <= limit) {
               left++;
            }
            right--;
        }
        return bCnt;
    }
}