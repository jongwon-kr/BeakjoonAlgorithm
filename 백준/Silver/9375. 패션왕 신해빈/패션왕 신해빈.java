import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> categoryCount = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String item = st.nextToken();
                String category = st.nextToken();

                categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
            }

            int combinations = 1;

            for (int count : categoryCount.values()) {
                combinations *= (count + 1);
            }

            combinations -= 1;

            bw.write(combinations + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
