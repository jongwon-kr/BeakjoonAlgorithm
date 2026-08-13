import java.util.*;
import java.io.*;

class Solution {
    static int maxCnt;
    public int solution(int k, int[][] dungeons) {

        Arrays.sort(dungeons, (o1, o2) -> {
            return o2[0] - o1[0];
        });
        boolean[] vis = new boolean[dungeons.length];
        maxCnt = Integer.MIN_VALUE;
        bt(0, k, 0, dungeons, vis);
        return maxCnt;
    }

    private void bt(int cur, int k, int depth, int[][] dungeons, boolean[] vis) {

        // 조건 최소피로도가 안되면 continue
        if (depth > dungeons.length) {
            return;
        }

        for (int i = 0; i < dungeons.length; i++) {

            if (k < dungeons[i][0] || vis[i]) continue;
            vis[i] = true;

            bt(i, k - dungeons[i][1], depth + 1, dungeons, vis);

            vis[i] = false;
        }
        maxCnt = Math.max(maxCnt, depth);
    }
}