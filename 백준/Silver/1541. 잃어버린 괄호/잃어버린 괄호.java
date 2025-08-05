import java.io.*;
import java.util.*;

public class Main {

    static String str = "";
    static ArrayList<String> elements = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        str = br.readLine();

        StringBuffer sb = new StringBuffer();
        for (char c : str.toCharArray()) {

            if (c == '+' || c == '-') {
                elements.add(String.valueOf(sb));
                sb = new StringBuffer();
                elements.add(String.valueOf(c));
            } else {
                sb.append(c);
            }
        }
        elements.add(String.valueOf(sb));

        int sum = 0;
        boolean checkMinus = false;
        for (int i = 0; i < elements.size(); i++) {
            String e = elements.get(i);
            if (e.equals("-")) {
                checkMinus = true;
            } else if (!e.equals("+")) {
                if (checkMinus) {
                    sum -= Integer.parseInt(e);
                } else {
                    sum += Integer.parseInt(e);
                }
            }
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
