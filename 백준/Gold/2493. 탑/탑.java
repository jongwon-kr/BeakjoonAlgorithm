import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] heights;
    static int[] results;
    static Stack<int[]> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        heights = new int[N];
        results = new int[N];

        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int currentHeight = heights[i];

            while (!stack.isEmpty() && stack.peek()[0] <= currentHeight) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                results[i] = 0;
            } else {
                results[i] = stack.peek()[1] + 1;
            }

            stack.push(new int[]{currentHeight, i});
        }

        for (int i = 0; i < N; i++) {
            bw.write(results[i] + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
