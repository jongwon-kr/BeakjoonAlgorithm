import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings);
        Arrays.sort(strings, (o1, o2) -> {
            int result = o1.charAt(n) - o2.charAt(n);
            return result;
        });

        return strings;
    }
}