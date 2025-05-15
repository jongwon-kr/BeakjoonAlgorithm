import java.io.*;
import java.util.*;

public class Main {

    static int N, K;
    static LinkedList<Integer> ll = new LinkedList();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("<");
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            ll.add(i);
        }

        int index = K - 1;
        while (ll.size() > 0) {

            if (index >= ll.size()) {
                index %= ll.size();
            }

            int value = ll.remove(index);
            index += K - 1;
            sb.append(value + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");

        System.out.print(sb);
    }
}
