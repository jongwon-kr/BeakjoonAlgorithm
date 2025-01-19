import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();

            if (cmd.startsWith("push_front")) {
                int x = Integer.parseInt(cmd.split(" ")[1]);
                deque.addFirst(x);
            } else if (cmd.startsWith("push_back")) {
                int x = Integer.parseInt(cmd.split(" ")[1]);
                deque.addLast(x);
            } else if (cmd.equals("pop_front")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.pollFirst() + "\n");
                }
            } else if (cmd.equals("pop_back")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.pollLast() + "\n");
                }
            } else if (cmd.equals("size")) {
                bw.write(deque.size() + "\n");
            } else if (cmd.equals("empty")) {
                bw.write((deque.isEmpty() ? 1 : 0) + "\n");
            } else if (cmd.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekFirst() + "\n");
                }
            } else if (cmd.equals("back")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekLast() + "\n");
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}