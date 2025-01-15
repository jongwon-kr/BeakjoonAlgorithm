import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int last = -1;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.startsWith("push")) {
                int value = Integer.parseInt(str.split(" ")[1]);
                queue.add(value);
                last = value;
            } else if (str.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.poll() + "\n");
                }
            } else if (str.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (str.equals("empty")) {
                bw.write((queue.isEmpty() ? "1" : "0") + "\n");
            } else if (str.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peek() + "\n");
                }
            } else if (str.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(last + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
