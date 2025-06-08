import java.io.*;
import java.util.*;

public class Main {

    static int L, R = 31, M = 1234567891;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] chars = st.nextToken().toCharArray();
        int sum = 0;

        for(int i = 0; i < L; i++){
            char c = chars[i];
            int a = c - 96;
            sum += hash(a, i);
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
    static int hash(int a, int num){
        int result = a;
        for(int i = 0; i < num; i++){
            result *= R;
        }
        return result;
    }
}
