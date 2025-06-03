import java.io.*;
import java.util.*;

public class Main {

    static int M, N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        boolean[] checkArr = new boolean[N + 1];
        for(int i = 0; i <= N; i++){
            checkArr[i] = true;
        }
        checkArr[0] = false;
        checkArr[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (checkArr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    checkArr[j] = false;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (checkArr[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
