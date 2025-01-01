import java.util.*;
import java.io.*;

public class Main {

    static int A, B, C;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        int num = A * B * C;
        int[] result = new int[10];
        while(num > 0){
            result[num % 10]++;
            num /= 10;
        }
        for(int i : result){
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
