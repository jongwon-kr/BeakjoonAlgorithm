import java.io.*;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        int result = calCnt();

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }

    static public int calCnt() {
        int cnt = 0;
        int cntFive = N / 5;

        while (cntFive >= 0) {
            int temp = N - (cntFive * 5);
            if (temp % 3 == 0) {
                cnt = cntFive + (temp / 3);
                return cnt;
            }
            cntFive--;
        }

        return -1;
    }
}
