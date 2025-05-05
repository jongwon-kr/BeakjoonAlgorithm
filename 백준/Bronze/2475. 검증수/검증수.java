import java.io.*;
import java.util.*;

public class Main {

    static int[] intArr = new int[5];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 5; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for(int i : intArr){
            sum += i * i;
        }

        int result = sum % 10;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}