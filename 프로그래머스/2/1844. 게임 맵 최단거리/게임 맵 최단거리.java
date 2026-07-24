import java.util.*;
import java.io.*;


class Solution {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {

        // 최단거리 BFS로 풀어야 함
        // 벽이 존재하고 반환 값은 최단거리이거나 도달하지 못하면 -1 반환
        // 시작지점 1,1 상대 진영 n,m
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int n = maps.length;
        int m = maps[0].length;
        int[][] dist = new int[n][m]; // 방문여부 or 거리 기록

        for (int[] arr : dist) {
            Arrays.fill(arr, -1);
        }

        dist[0][0] = 0;
        q.offer(new int[]{0, 0});

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            int distance = dist[x][y] + 1;

            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (maps[nx][ny] == 0 || dist[nx][ny] > -1) continue;

                dist[nx][ny] = distance;
                q.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}