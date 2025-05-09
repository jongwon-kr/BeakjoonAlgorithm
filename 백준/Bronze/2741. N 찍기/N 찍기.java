import java.io.*;
import java.util.*;

public class Main {

    static int N = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}