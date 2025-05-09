import java.io.*;
import java.util.*;


public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        bw.write(N+"\n");
        bw.write("1");
        bw.flush();
        bw.close();
        br.close();
    }

}