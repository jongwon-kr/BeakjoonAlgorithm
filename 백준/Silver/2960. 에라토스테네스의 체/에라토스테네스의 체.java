import java.io.*;
import java.util.*;

public class Main {

    static int N, K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        boolean[] checkArr = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            checkArr[i] = true;
        }

        int cnt = 0;
        for (int i = 2; i <= N; i++) {
            if (checkArr[i]) {
                for (int j = i; j <= N; j += i) {
                    if (checkArr[j]) {
                        checkArr[j] = false;
                        cnt++;
                        if (cnt == K) {
                            bw.write(j + "\n");
                            bw.flush();
                            return;
                        }
                    }
                }
            }
        }
        br.close();
        bw.close();
    }
}
