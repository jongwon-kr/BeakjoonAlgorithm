import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        N = Integer.parseInt(br.readLine());

        int target = 0;
        int temp = 1;

        for (int i = 1; i <= N; i++) {
            target = Integer.parseInt(br.readLine());

            while (temp <= target) {
                stack.push(temp++);
                sb.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                sb.setLength(0);
                sb.append("NO");
                System.out.println(sb);
                return;
            }
        }
        System.out.println(sb);
        br.close();
    }
}
