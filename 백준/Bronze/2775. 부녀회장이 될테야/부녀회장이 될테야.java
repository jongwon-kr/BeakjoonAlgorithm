import java.io.*;
import java.util.*;

public class Main {

    static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());
        int k = 0, n = 0;

        for (int i = 0; i < T; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            int result = cntHuman(k, n);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int cntHuman(int k, int n) {
        int[][] apt = new int[k + 1][n];
        for (int i = 0; i < k + 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0) {
                    apt[i][j - 1] = j;
                } else {
                    int sum = 0;
                    for (int l = 0; l < j; l++) {
                        sum += apt[i - 1][l];
                    }
                    apt[i][j - 1] = sum;
                }
            }
        }
        return apt[k][n - 1];
    }
}
