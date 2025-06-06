import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static ArrayList<Integer> conList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            int con = getCon(i);
            if (con == N) {
                conList.add(i);
            }
        }
        if (conList.size() > 0) {
            bw.write(conList.get(0) + "");
        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int getCon(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
