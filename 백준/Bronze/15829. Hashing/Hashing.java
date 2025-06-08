import java.io.*;
import java.util.*;

public class Main {

    static final int R = 31;
    static final int M = 1234567891;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        long sum = 0;

        for(int i = 0; i < L; i++){
            int a = chars[i] - 'a' + 1;
            sum = (sum + hash(a, i)) % M;
        }

        bw.write(Long.toString(sum));
        bw.flush();
        bw.close();
        br.close();
    }

    static long hash(int a, int num){
        long result = a;
        long pow = 1;
        for(int i = 0; i < num; i++){
            pow = (pow * R) % M;
        }
        result = (result * pow) % M;
        return result;
    }
}
