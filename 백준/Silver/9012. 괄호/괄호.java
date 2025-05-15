import java.io.*;
import java.util.*;

public class Main {

    static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            bw.write(checkVPS(str) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static String checkVPS(String str) {
        char[] charArr = str.toCharArray();
        LinkedList<Character> tempArr = new LinkedList();

        if (charArr[0] != '(') {
            return "NO";
        }

        if (charArr[charArr.length - 1] != ')') {
            return "NO";
        }

        for (char c : charArr) {
            tempArr.add(c);
            if (tempArr.size() > 1) {
                if (tempArr.get(tempArr.size() - 1) == ')' && tempArr.get(tempArr.size() - 2) == '(') {
                    tempArr.removeLast();
                    tempArr.removeLast();
                }
            }
        }
        if (tempArr.size() == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
