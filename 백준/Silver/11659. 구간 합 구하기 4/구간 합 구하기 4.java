import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] arr;
    static int[] sArr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        sArr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if (i == 0) {
                sArr[i] = arr[i];
            } else {
                sArr[i] = sArr[i - 1] + arr[i];
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sIdx = Integer.parseInt(st.nextToken());
            int eIdx = Integer.parseInt(st.nextToken());

            bw.write(getSum(sIdx, eIdx) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int getSum(int sIdx, int eIdx) {
        if (sIdx == 1) {
            return sArr[eIdx - 1];
        }  else {
            return sArr[eIdx - 1] - sArr[sIdx - 2];
        }
    }
}
