import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;
            char[] chars = str.toCharArray();
            int endIndex = chars.length - 1;
            String result = "yes";
            for (int i = 0; i < chars.length / 2; i++) {
                if (!compare(chars[i], chars[endIndex--])) {
                    result = "no";
                    break;
                }
                ;
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean compare(char a, char b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

}
