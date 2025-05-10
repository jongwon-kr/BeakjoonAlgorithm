import java.io.*;
import java.util.*;

public class Main {

    static int T;
    static String oxStr = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            oxStr = st.nextToken();
            char[] arr = oxStr.toCharArray();
            int score = 0;
            int temp = 0;
            for (char c : arr) {
                if (c == 'O') {
                    temp++;
                    score += temp;
                } else {
                    temp = 0;
                }
            }
            bw.write(score + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}