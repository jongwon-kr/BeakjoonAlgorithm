import java.io.*;
import java.util.*;

public class Main {

    static int T = 0, H = 0, W = 0, N = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            bw.write(getRoomForN(H, W, N) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static String getRoomForN(int H, int W, int N) {
        int floor = (N % H == 0) ? H : N % H;
        int room = (N % H == 0) ? N / H : (N / H) + 1;

        return String.format("%d%02d", floor, room);
    }
}