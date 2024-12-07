import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> map = new HashMap<>();
        TreeSet<Character> result = new TreeSet<>();    // 사전 순

        for (int i = 0; i < N; i++) {
            String player = br.readLine();
            char firstChar = player.charAt(0);
            map.put(firstChar, map.getOrDefault(firstChar, 0) + 1);

            if (map.get(firstChar) == 5) {
                result.add(firstChar);
            }
        }

        // 결과 출력
        if (result.isEmpty()) {
            bw.write("PREDAJA");
        } else {
            for (char c : result) {
                bw.write(c);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
