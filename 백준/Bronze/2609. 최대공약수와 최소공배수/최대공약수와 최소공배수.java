import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int maxDivisor = Integer.MIN_VALUE;
        int minMultiple = Integer.MAX_VALUE;

        int i = 0;
        while(true){
            i++;
            if(a % i == 0 && b % i ==0 && i > maxDivisor){
                maxDivisor = i;
            }

            if(i % a == 0 && i % b == 0){
                minMultiple = i;
                break;
            }
        }
        bw.write(maxDivisor + "\n" + minMultiple);
        bw.flush();
        bw.close();
        br.close();
    }

}
