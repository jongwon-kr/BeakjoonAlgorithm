import java.io.*;
import java.util.*;

public class Main {

    static int A = 0, B = 0, C = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());

        int result1 = A + B - C;
        String AB = String.valueOf(A)+String.valueOf(B);
        int result2 = Integer.parseInt(AB) - C;

        bw.write(result1 + "\n" + result2 + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}