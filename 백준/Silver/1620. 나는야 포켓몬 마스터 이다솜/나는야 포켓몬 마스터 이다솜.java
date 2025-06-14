import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static HashMap<Integer, String> doc = new HashMap<>();
    static HashMap<String, Integer> rDoc = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            doc.put(i + 1, name);
            rDoc.put(name, i + 1);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            if (isNumeric(str)) {
                int idx = Integer.parseInt(str);
                bw.write(doc.get(idx) + "\n");
            } else {
                bw.write(rDoc.get(str) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
