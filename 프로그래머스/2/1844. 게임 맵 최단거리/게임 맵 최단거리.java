import java.util.*;
import java.io.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int N, M;

    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        boolean[][] visited = new boolean[N][M];

        return bfs(0, 0, maps, visited);
    }

    public int bfs(int startX, int startY, int[][] maps, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{startX, startY, 1});
        visited[startX][startY] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (x == N - 1 && y == M - 1) {
                   return dist;
                }

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return -1;
    }
}