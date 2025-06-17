import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr.add(num);
        }

        arr.sort(Comparator.comparingInt((Integer i) -> i).reversed());

        int result = 0;
        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = i; j < N; j++){
                sum += arr.get(j);
            }
            result += sum;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
