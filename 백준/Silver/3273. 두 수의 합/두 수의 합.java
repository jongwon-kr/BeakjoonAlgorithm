import java.util.*;
import java.io.*;

public class Main {

    static int N, X;
    static int[] numArr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        numArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        X = Integer.parseInt(br.readLine());

        Arrays.sort(numArr);

        int result = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (numArr[i] + numArr[j] == X) {
                    result++;
                    break;
                }
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
