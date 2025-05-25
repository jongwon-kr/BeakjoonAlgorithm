import java.io.*;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int num = 666;

        while(true){
            if(String.valueOf(num).contains("666")){
                cnt++;
                if(cnt == N){
                    break;
                }
            }
            num++;
        }
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
