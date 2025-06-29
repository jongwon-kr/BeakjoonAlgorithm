import java.io.*;
import java.util.*;

public class Main {

    static int T, R, C;
    static char[][] candyMap;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            if (str.length() < 1) {
                str = br.readLine();
                R = Integer.parseInt(str.split(" ")[0]);
                C = Integer.parseInt(str.split(" ")[1]);
                candyMap = new char[R][C];
            }
            for (int j = 0; j < R; j++) {
                String line = br.readLine();
                char[] charArr = line.toCharArray();
                for (int k = 0; k < charArr.length; k++) {
                    candyMap[j][k] = charArr[k];
                }
            }
            bw.write(getCandy() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int getCandy() {
        int candyCnt = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (j < C - 2 && candyMap[i][j] == '>' && candyMap[i][j + 1] == 'o' && candyMap[i][j + 2] == '<') {
                    candyCnt++;
                } else if (i < R - 2 && candyMap[i][j] == 'v' && candyMap[i + 1][j] == 'o' && candyMap[i + 2][j] == '^') {
                    candyCnt++;
                }
            }
        }
        return candyCnt;
    }
}
