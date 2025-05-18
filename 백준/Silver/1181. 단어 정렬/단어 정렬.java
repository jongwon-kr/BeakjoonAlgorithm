import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static ArrayList<String> words = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            if (words.contains(word)) continue;
            words.add(word);
        }

        words.sort(Comparator.comparingInt((String word) -> word.length()).thenComparing((String word) -> word));

        for (String w : words) {
            bw.write(w + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
