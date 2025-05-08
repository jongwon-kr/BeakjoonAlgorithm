import java.io.*;
import java.util.*;


public class Main {

    // 행성
    static class Planet {
        int cx;
        int cy;
        int r;

        public Planet(int cx, int cy, int r) {
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }
    }

    static int T, N;    // T: 테스트 수, N: 행성 수
    static int[] startEnd = new int[4]; // [0] 시작 x, [1] 시작 y, [2] 끝 x, [3] 끝 y
    static LinkedList<Planet> pLL = new LinkedList<Planet>();  // 행성 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < startEnd.length; k++) {
                startEnd[k] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                pLL.add(new Planet(cx, cy, r));
            }
            int result = getMinEnterCnt();
            bw.write(result + "\n");
            pLL.clear();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static public int getMinEnterCnt() {
        int sx = startEnd[0];
        int sy = startEnd[1];
        int ex = startEnd[2];
        int ey = startEnd[3];
        int cnt = 0;
        for (Planet p : pLL) {
            boolean isInStart = isInside(sx, sy, p);
            boolean isInEnd = isInside(ex, ey, p);
            if ((isInStart && !isInEnd) || (!isInStart && isInEnd)) {
                cnt++;
            }
        }
        return cnt;
    }

    static boolean isInside(int x, int y, Planet p) {
        int dx = x - p.cx;
        int dy = y - p.cy;
        return dx * dx + dy * dy < p.r * p.r;
    }
}