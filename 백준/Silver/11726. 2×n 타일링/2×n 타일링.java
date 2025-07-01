import java.io.*;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        int[] dp = new int[N + 1];
        dp[1] = 1;

        if (N > 1) {
            dp[2] = 2;
            for (int i = 3; i < N + 1; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
            }
        }
        bw.write(dp[N] + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
