import java.io.*;
import java.util.*;

public class Main {

    // 빠른 거듭제곱 (A^B % C) 함수
    public static long modExp(long A, long B, long C) {
        long result = 1;
        A = A % C;

        while (B > 0) {
            if (B % 2 == 1) {
                result = (result * A) % C;
            }
            A = (A * A) % C;
            B = B / 2;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        long result = modExp(A, B, C);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
