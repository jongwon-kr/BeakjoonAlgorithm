import java.util.*;

class Solution {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;
    static int n, m;

    public int solution(int[][] maps) {
        ArrayDeque<int []> adq = new ArrayDeque<>();
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];

        adq.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!adq.isEmpty()) {
            int[] cur = adq.poll();
            int cx = cur[0];
            int cy = cur[1];
            int distance = maps[cx][cy] + 1;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (visited[nx][ny] || maps[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                maps[nx][ny] = distance;
                adq.offer(new int[]{nx, ny});
            }
        }
        
        if (maps[n-1][m-1] <= 1) {
            return -1;
        }

        return maps[n-1][m-1];
    }
}