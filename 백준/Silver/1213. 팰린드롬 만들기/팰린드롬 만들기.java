import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'A']++;
        }

        int oddCount = 0;
        char middle = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                middle = (char) (i + 'A');
            }
        }

        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder half = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                half.append((char) (i + 'A'));
            }
        }

        StringBuilder result = new StringBuilder(half);
        if (oddCount == 1) {
            result.append(middle);
        }
        result.append(half.reverse());

        System.out.println(result.toString());
    }
}
