import java.util.*;
import java.io.*;

public class Main {

    static int roomNumber;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        roomNumber = Integer.parseInt(br.readLine());
        int[] cntNums = new int[9];

        while (roomNumber > 0) {
            if (roomNumber % 10 == 6 || roomNumber % 10 == 9) {
                cntNums[6]++;
            } else {
                cntNums[roomNumber % 10]++;
            }
            roomNumber /= 10;
        }

        int result = 0;

        while (true) {
            result++;
            for (int i = 0; i < 9; i++) {
                if (i == 6) {
                    cntNums[i] -= 2;
                } else {
                    cntNums[i]--;
                }
            }
            int check = 0;
            for(int i : cntNums){
                if(i > 0){
                    check++;
                }
            }
            if(check == 0){
                break;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
