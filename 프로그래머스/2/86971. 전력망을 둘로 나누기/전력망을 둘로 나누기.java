import java.util.*;
import java.io.*;

class Solution {

    public int solution(int n, int[][] wires) {
        int min = Integer.MAX_VALUE;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int[] w : wires) {
            map.putIfAbsent(w[0], new ArrayList<Integer>());
            map.get(w[0]).add(w[1]);
            map.putIfAbsent(w[1], new ArrayList<Integer>());
            map.get(w[1]).add(w[0]);
        }

        for (int[] w : wires) {
            int a = w[0];
            int b = w[1];
            int cnt = dfs(a, b, map);
            min = Math.min(min, Math.abs(cnt - (n - cnt)));
        }

        return min;
    }

    private int dfs(int a, int b, Map<Integer, ArrayList<Integer>> map) {
        int cnt = 1;

        for (int n : map.get(a)) {
            if (b == n) continue;
            cnt += dfs(n, a, map);
        }
        return cnt;
    }
}