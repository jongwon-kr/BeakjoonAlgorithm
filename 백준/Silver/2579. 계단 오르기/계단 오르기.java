import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] arr;
    static int[] dp = new int[301];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];

        // 각 계단에 부여된 점수 저장
        for(int i = 1; i < N + 1; i++){
            st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            arr[i] = score;
        }

        dp[1] = arr[1];
        if(N > 1){
            dp[2] = arr[1] + arr[2];

            for(int i = 3; i < N + 1; i++){
                dp[i] = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
            }
        }

        bw.write(dp[N] + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
