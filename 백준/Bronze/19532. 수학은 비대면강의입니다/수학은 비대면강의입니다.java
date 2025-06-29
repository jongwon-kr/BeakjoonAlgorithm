import java.io.*;
import java.util.*;

public class Main {

    static int[] nums = new int[6];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(getXY());
        bw.flush();
        bw.close();
        br.close();
    }

    static String getXY(){

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if ((nums[0] * x + nums[1] * y == nums[2]) &&
                        (nums[3] * x + nums[4] * y == nums[5])) {
                    return x + " " + y;
                }
            }
        }

        return "";
    }
}
