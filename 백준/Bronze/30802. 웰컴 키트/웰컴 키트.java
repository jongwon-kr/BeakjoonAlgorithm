import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] orders;
    static int T, P;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        orders = new int[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            orders[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        int tCnt = 0;
        for (int num : orders) {
            int order = num;
            while (true) {
                if (order <= 0) {
                    break;
                } else {
                    order -= T;
                }
                tCnt++;
            }
        }

        bw.write(tCnt + "\n");
        bw.write(N / P + " " + N % P);
        bw.flush();
        bw.close();
        br.close();
    }
}
