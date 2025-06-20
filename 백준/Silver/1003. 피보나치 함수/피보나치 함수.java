import java.io.*;
import java.util.*;

public class Main {

    static int T, N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            bw.write(fib(N)[0] + " " + fib(N)[1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int[] fib(int n) {
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        if (n > 0) {
            fibList[1] = 1;

            for (int i = 2; i <= n; i++) {
                fibList[i] = fibList[i - 1] + fibList[i - 2];
            }
            return new int[]{fibList[n - 1], fibList[n]};
        }
        return new int[]{1, fibList[n]};
    }

}
