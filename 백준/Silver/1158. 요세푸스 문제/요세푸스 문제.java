import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

    static int N, K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = -1;

        while (!list.isEmpty()) {
            index += K;
            if (index >= list.size()) {
                index %= list.size();
            }
            if (list.size() < K) {

            }
            result.add(list.get(index));
            list.remove(index--);
        }

        for (int i = 0; i < result.size(); i++) {
            if(result.size() != 1){
                if (i == 0) {
                    bw.write("<" + result.get(i) + ", ");
                } else if (i == result.size() - 1) {
                    bw.write(result.get(i) + ">");
                } else {
                    bw.write(result.get(i) + ", ");
                }
            }else{
                bw.write("<" + result.get(i) + ">");
            }
        }
        bw.flush();
    }
}
