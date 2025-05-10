import java.io.*;
import java.util.*;

public class Main {

    static int[] arr = new int[8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String result = check(arr[0]);

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }

    static String check(int startNum) {
        if (startNum == 1) {
            for (int i : arr) {
                if (i == startNum) {
                    startNum++;
                } else {
                    return "mixed";
                }
            }
            return "ascending";
        }else
        if (startNum == 8) {
            for (int i : arr) {
                if (i == startNum) {
                    startNum--;
                } else {
                    return "mixed";
                }
            }
            return "descending";
        }else{
            return "mixed";
        }
    }
}