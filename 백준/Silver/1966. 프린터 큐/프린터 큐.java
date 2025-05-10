import java.io.*;
import java.util.*;

public class Main {

    static int T, N, M;   // T: 테스트 케이스, N: 문서 개수, M: 놓여있는 인덱스
    static Queue<Integer> rankQueue = new LinkedList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                rankQueue.add(Integer.parseInt(st.nextToken()));
            }

            int result = findPrintSequence();
            if (result == 0) {
                result = 1;
            }
            bw.write(result + "\n");
            rankQueue.clear();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int findPrintSequence() {
        int tempIdx = M;
        int cnt = 0;

        while (true) {
            int current = rankQueue.poll();
            boolean hasBig = false;

            for (int r : rankQueue) {
                if (r > current) {
                    hasBig = true;
                    break;
                }
            }

            if (hasBig) {
                rankQueue.add(current);
                if (tempIdx == 0) {
                    tempIdx = rankQueue.size() - 1;
                } else {
                    tempIdx--;
                }
            } else {
                cnt++;
                if (tempIdx == 0) {
                    return cnt;
                } else {
                    tempIdx--;
                }
            }
        }
    }

}