import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            Stack<Character> s = new Stack<>();

            for (char c : word.toCharArray()) {
                if (!s.isEmpty() && s.peek() == c) {
                    s.pop();
                } else {
                    s.push(c);
                }
            }

            if (s.isEmpty()) {
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
