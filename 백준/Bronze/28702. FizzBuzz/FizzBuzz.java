import java.io.*;
import java.util.*;

public class Main {

    static int N = 3;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lastNumIdx = 0;
        int lastNum = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (!str.equals("Fizz") && !str.equals("Buzz") && !str.equals("FizzBuzz")) {
                lastNum = Integer.parseInt(str);
                lastNumIdx = i;
            }
        }
        int result = lastNum + (3 - lastNumIdx);
        if (result % 3 == 0 && result % 5 == 0) {
            bw.write("FizzBuzz");
        } else if (result % 3 == 0 && result % 5 != 0) {
            bw.write("Fizz");
        } else if (result % 5 == 0 && result % 3 != 0) {
            bw.write("Buzz");
        } else {
            bw.write(result + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}