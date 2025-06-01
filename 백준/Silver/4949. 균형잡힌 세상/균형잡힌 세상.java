import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Character> parentheses = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }

            char[] charArray = str.toCharArray();

            for (char c : charArray) {
                if (c == '(' || c == ')') {
                    if (parentheses.size() > 0) {
                        if (parentheses.get(parentheses.size() - 1) == '(' && c == ')') {
                            parentheses.remove(parentheses.size() - 1);
                        } else {
                            parentheses.add(c);
                        }
                    } else {
                        parentheses.add(c);
                    }
                } else if (c == '[' || c == ']') {
                    if (parentheses.size() > 0) {
                        if (parentheses.get(parentheses.size() - 1) == '[' && c == ']') {
                            parentheses.remove(parentheses.size() - 1);
                        } else {
                            parentheses.add(c);
                        }
                    } else {
                        parentheses.add(c);
                    }
                }

            }
            if (parentheses.size() == 0 && str.endsWith(".")) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
            parentheses.clear();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
