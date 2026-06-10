import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> idMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idMap.put(id_list[i], i);
        }

        Map<String, HashSet<String>> reportedMap = new HashMap<>();
        for (String id : id_list) {
            reportedMap.put(id, new HashSet<>());
        }

        for (String r : report) {
            String[] split = r.split(" ");
            String reporter = split[0];  // 신고한 사람
            String reported = split[1];  // 신고당한 사람

            reportedMap.get(reported).add(reporter);
        }

        for (String reported : id_list) {
            HashSet<String> reporters = reportedMap.get(reported);

            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    int reporterIdx = idMap.get(reporter);
                    answer[reporterIdx]++;
                }
            }
        }

        return answer;
    }
}