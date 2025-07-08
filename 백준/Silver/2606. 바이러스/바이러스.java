import java.io.*;
import java.util.*;

public class Main {


    static void bfs(int startNode) {
        Queue<Integer> q = new LinkedList<>();
        visited[startNode] = true;
        q.add(startNode);

        while (!q.isEmpty()) {
            int cN = q.poll();

            for (int n : graph.get(cN)) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    static int N, P;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        P = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int sN = Integer.parseInt(st.nextToken());
            int eN = Integer.parseInt(st.nextToken());

            graph.get(sN).add(eN);
            graph.get(eN).add(sN);
        }

        bfs(1);

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (visited[i]) {
                cnt++;
            }
        }

        bw.write(cnt - 1 + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
