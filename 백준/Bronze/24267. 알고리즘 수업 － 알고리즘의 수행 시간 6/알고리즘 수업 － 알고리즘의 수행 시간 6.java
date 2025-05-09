import java.io.*;
import java.util.*;


public class Main {

    static Long N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Long.parseLong(st.nextToken());
        Long cnt = 0L;
        Long temp = 0L;

        for (Long i = 3L; i <= N; i++) {
            if (i == 3L) {
                cnt += 1L;
            } else if (i < 6L) {
                temp += 3L;
                cnt += temp;
            } else {
                temp += i - 2L;
                cnt += temp;
            }
        }

        bw.write(cnt + "\n");
        bw.write("3");
        bw.flush();
        bw.close();
        br.close();
    }
}