import java.io.*;
import java.util.*;

public class Main {

    // N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
    // 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
    // N장의 카드 중에서 3장의 카드를 골라야 한다.

    static int N, M;
    static int[] cards;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        int closeNum = 0;

        for(int i = 0; i < N; i++){
            int sum = 0;
            int n1 = cards[i];
            for(int j = 0; j < N; j++){
                int n2;
                if(j != i){
                    n2 = cards[j];
                    for(int k = 0; k < N; k++){
                        int n3;
                        if(k != j && k != i){
                            n3 = cards[k];
                            sum = n1 + n2 + n3;
                            if(sum <= M){
                                closeNum = Math.max(sum, closeNum);
                            }
                        }
                    }
                }
            }
        }

        bw.write(closeNum+"");
        bw.flush();
        bw.close();
        br.close();
    }

}
