import java.io.*;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int i = 5;
        while (N >= i) {
            cnt += N / i;
            i *= 5;
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
