import java.io.*;
import java.util.HashMap;

public class Main {

    public static String S = "";

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = br.readLine();

        int a = 'a';
        int z = 'z';

        for (int i = a; i <= z; i++) {
            int cnt = 0;
            for (int c : S.toCharArray()) {
                if(c == i){
                    cnt++;
                }
            }
            bw.write(cnt + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}