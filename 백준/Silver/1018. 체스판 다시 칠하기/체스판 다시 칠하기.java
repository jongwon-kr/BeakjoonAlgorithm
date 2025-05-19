import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static char[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            board[i] = str.toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int cnt = getChangeCnt(i, j);
                min = Math.min(min, cnt);
            }
        }

        bw.write(min + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    // W의 개수와 B의 개수를 찾아서 더 작은 수 반환
    static int getChangeCnt(int x, int y) {
        int cntW = 0;
        int cntB = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') {
                        cntW++;
                    }
                    if (board[i][j] != 'B') {
                        cntB++;
                    }
                } else {
                    if (board[i][j] != 'B') {
                        cntW++;
                    }
                    if (board[i][j] != 'W') {
                        cntB++;
                    }
                }
            }
        }
        return Math.min(cntW, cntB);
    }
}
