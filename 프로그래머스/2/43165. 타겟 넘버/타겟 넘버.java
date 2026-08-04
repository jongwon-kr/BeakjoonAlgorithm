import java.util.*;
import java.io.*;

class Solution {

    static int cnt;

    public int solution(int[] numbers, int target) {

        cnt = 0;

        dfs(0, 0, target, numbers);

        return cnt;
    }

    private void dfs(int n, int sum, int target, int[] numbers) {

        if (n == numbers.length) {
            if (sum == target) {
                cnt++;
            }
            return;
        }

        dfs(n + 1, sum + numbers[n], target, numbers);
        dfs(n + 1, sum - numbers[n], target, numbers);
    }
}