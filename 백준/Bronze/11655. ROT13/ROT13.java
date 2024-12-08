import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                result.append((char) ((c - 'A' + 13) % 26 + 'A'));
            } else if ('a' <= c && c <= 'z') {
                result.append((char) ((c - 'a' + 13) % 26 + 'a'));
            } else {
                result.append(c);
            }
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
