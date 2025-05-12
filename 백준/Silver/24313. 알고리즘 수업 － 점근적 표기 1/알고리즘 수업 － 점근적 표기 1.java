import java.io.*;
import java.util.*;

public class Main {

    static long a1, a0, c, n0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a1 = Long.parseLong(st.nextToken());
        a0 = Long.parseLong(st.nextToken());

        c = Long.parseLong(br.readLine());
        n0 = Long.parseLong(br.readLine());

        int result = checkBigO();
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    static int checkBigO() {
        for (long n = n0; n <= 100; n++) {
            long fn = a1 * n + a0;
            long gn = c * n;
            if (fn > gn) {
                return 0;
            }
        }
        return 1;
    }
}
