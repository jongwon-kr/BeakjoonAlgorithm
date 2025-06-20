import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static HashMap<String, String> note = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String address = st.nextToken();
            String password = st.nextToken();
            note.put(address, password);
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            String address = st.nextToken();
            bw.write(note.get(address)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
