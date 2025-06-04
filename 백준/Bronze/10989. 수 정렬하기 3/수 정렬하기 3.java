import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static HashMap<Integer, Integer> nums = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            nums.put(num, nums.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(nums.entrySet());
        entries.sort(Map.Entry.comparingByKey());

        for (Map.Entry<Integer, Integer> entry : entries) {
            int key = entry.getKey();
            int cnt = entry.getValue();
            for (int i = 0; i < cnt; i++) {
                bw.write(key + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
