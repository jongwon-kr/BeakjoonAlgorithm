import java.util.*;
import java.io.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        makeList(str1, list1);
        makeList(str2, list2);

        if(list1.isEmpty() && list2.isEmpty()) {
            return 65536;
        }

        int intersection = 0;
        List<String> copyList2 = new ArrayList<>(list2);

        for(String s : list1) {
            if(copyList2.remove(s)) {
                intersection++;
            }
        }

        int union = list1.size() + list2.size() - intersection;

        double jaccard = (double) intersection / union;
        return (int) (jaccard * 65536);
    }

    private void makeList(String str, List<String> list) {
        for(int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);

            if(Character.isLetter(c1) && Character.isLetter(c2)) {
                list.add("" + c1 + c2);
            }
        }
    }
}