import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        ArrayList<Integer> numList = new ArrayList<>();

        for(String num : s.split(" ")) {
            numList.add(Integer.parseInt(num));
        }

        Collections.sort(numList);

        String result = numList.get(0) + " " + numList.get(numList.size() - 1);
        return result;
    }
}