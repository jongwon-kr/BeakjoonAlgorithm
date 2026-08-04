import java.util.*;
import java.io.*;

class Solution {

    static boolean[] vis;

    public int solution(int n, int[][] computers) {
        vis = new boolean[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, n, computers);
                cnt++;
            }
        }

        return cnt;
    }

    private void dfs(int curN, int n, int[][] coms) {

        vis[curN] = true;

        for (int j = 0; j < n; j++) {
            if (coms[curN][j] == 1 && !vis[j]) {
                dfs(j, n, coms);
            }
        }
    }
}