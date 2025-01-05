import java.io.*;
import java.util.*;

public class Main {

    static int K;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        K = Integer.parseInt(br.readLine());

        for(int i = 0; i < K; i++){
            int n = Integer.parseInt(br.readLine());
            if (n == 0 && !stack.isEmpty()) {
                stack.pop();
            }else{
                stack.push(n);
            }
        }

        int sum = 0;
        for(int i : stack){
            sum += i;
        }

        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
