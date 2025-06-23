import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int dp[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        dp = new int[N + 1];
        dp[1] = 0;

        // bottom -> top
        for (int i = 2; i <= N; i++) {
            // -1 연산을 거꾸로 + 1
            dp[i] = dp[i - 1] + 1;

            // i가 2로 나뉘어질때 연산 비교 후 최소값
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // i가 3으로 나뉘어질때 연산 비교 후 최소값
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        bw.write(dp[N] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
