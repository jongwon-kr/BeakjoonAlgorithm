import java.io.*;
import java.util.*;

public class Main {

    static int T;
    static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        arr = new String[T];
        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        for (String str : arr) {
            char[] charArr = str.toCharArray();
            int index = 0;
            LinkedList<Character> list = new LinkedList<>();
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '-') {
                    if (index != 0) {
                        list.remove(index-1);
                        index--;
                    }
                } else if (charArr[i] == '<') {
                    if (index != 0) {
                        index--;
                    }
                } else if (charArr[i] == '>') {
                    if (index != list.size()) {
                        index++;
                    }
                } else {
                    list.add(index, charArr[i]);
                    index++;
                }
            }
            for(char c : list){
                bw.write(c);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
