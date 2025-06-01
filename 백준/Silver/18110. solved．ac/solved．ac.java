import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static ArrayList<Integer> scores = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            scores.add(score);
        }

        double size = scores.size();
        double sum = 0;
        int startIndex = (int) Math.round(size * 0.15);
        int endIndex = scores.size() - startIndex;


        scores.sort(Comparator.comparingInt((Integer i) -> i));
        for (int i = startIndex; i < endIndex; i++) {
            sum += scores.get(i);
        }


        sum = (int) Math.round(sum / (endIndex - startIndex));
        bw.write((int)sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
