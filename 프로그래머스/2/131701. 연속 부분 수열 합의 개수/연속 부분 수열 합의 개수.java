import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < len; i++) {
            int currentSum = 0;

            for (int j = 0; j < len; j++) {
                currentSum += elements[(i + j) % len];
                resultSet.add(currentSum);
            }
        }

        return resultSet.size();
    }
}