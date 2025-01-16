import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        // ArrayDeque 사용
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 카드 처리
        while (queue.size() > 1) {
            queue.poll(); // 첫 번째 카드 버리기
            queue.add(queue.poll()); // 두 번째 카드를 맨 뒤로 옮기기
        }

        // 마지막으로 남은 카드 출력
        System.out.println(queue.poll());
    }
}
