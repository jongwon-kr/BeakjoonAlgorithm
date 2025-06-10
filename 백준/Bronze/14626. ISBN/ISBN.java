import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] charArr = str.toCharArray();

        int w = 1;
        int sum = 0;
        int checkW = 0;
        int starIndex = -1;

        for (int i = 0; i < charArr.length; i++) {
            if (i % 2 == 0) {
                w = 1;
            } else {
                w = 3;
            }

            if (charArr[i] == '*') {
                checkW = w;
                starIndex = i;
            } else {
                sum += Integer.parseInt(String.valueOf(charArr[i])) * w;
            }
        }

        int result = 0;
        for (int i = 0; i <= 9; i++) {
            if ((sum + checkW * i) % 10 == 0) {
                result = i;
                break;
            }
        }

        bw.write("" + result);
        bw.flush();
        bw.close();
        br.close();
    }
}