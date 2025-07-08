import java.io.*;
import java.util.*;

public class Main {

    static int T;
    static int N;
    static long[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            dp = new long[N + 1];

            for (int j = 1; j <= N; j++) {
                long value = getTCnt(j);
                dp[j] = value;
            }

            bw.write(dp[(int)N] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static long getTCnt(int n) {
        if (n <= 3) {
            return 1;
        } else {
            return dp[n - 3] + dp[n - 2];
        }
    }
}
