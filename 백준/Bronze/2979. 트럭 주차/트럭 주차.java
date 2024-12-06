import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static int A, B, C;
    public static ArrayList<int[]> tArr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        tArr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            min = Math.min(arr[0], min);
            max = Math.max(arr[1], max);
            tArr.add(arr);
        }

        int tCnt = 0;
        int totalPay = 0;
        for (int i = min; i < max; i++) {
            for (int[] truk : tArr) {
                if(i == truk[0]){
                    tCnt++;
                }

                if(i == truk[1]){
                    tCnt--;
                }
            }
            if (tCnt == 1) {
                totalPay += A;
            } else if (tCnt == 2) {
                totalPay += (B * 2);
            } else if (tCnt == 3) {
                totalPay += (C * 3);
            }
        }
        bw.write(totalPay + "");
        bw.flush();
        br.close();
        bw.close();
    }

}
