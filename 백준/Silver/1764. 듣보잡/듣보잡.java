import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static HashSet<String> set = new HashSet<>();
    static ArrayList<String> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st  = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                result.add(name);
            }
        }

        result.sort(Comparator.comparing((String str) -> str));

        sb.append(result.size()).append('\n');
        for (String name : result) {
            sb.append(name).append('\n');
        }

        System.out.print(sb);
    }
}
