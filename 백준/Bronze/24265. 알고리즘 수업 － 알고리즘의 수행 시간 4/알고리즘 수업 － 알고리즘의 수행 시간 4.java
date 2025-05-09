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

        for (int i = 1; i < N; i++) {
            cnt += i;
        }

        bw.write(cnt + "\n");
        bw.write("2");
        bw.flush();
        bw.close();
        br.close();
    }

}