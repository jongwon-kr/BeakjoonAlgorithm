import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int baseMin = fees[0];
        int baseFee = fees[1];
        int overMin = fees[2];
        int overFee = fees[3];

        Map<String, Integer> inTimeMap = new HashMap<>();
        Map<String, Integer> totalTimeMap = new HashMap<>();

        for (String r : records) {
            String[] parts = r.split(" ");
            int time = getMinutes(parts[0]);
            String carNum = parts[1];
            String stat = parts[2];

            if (stat.equals("IN")) {
                inTimeMap.put(carNum, time);
            } else {
                int inTime = inTimeMap.remove(carNum);
                int stayTime = time - inTime;
                totalTimeMap.put(carNum, totalTimeMap.getOrDefault(carNum, 0) + stayTime);
            }
        }

        int endOfDay = getMinutes("23:59");
        for (Map.Entry<String, Integer> entry : inTimeMap.entrySet()) {
            String carNum = entry.getKey();
            int inTime = entry.getValue();
            int stayTime = endOfDay - inTime;
            totalTimeMap.put(carNum, totalTimeMap.getOrDefault(carNum, 0) + stayTime);
        }

        List<String> carList = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(carList);

        int[] answer = new int[carList.size()];
        for (int i = 0; i < carList.size(); i++) {
            String carNum = carList.get(i);
            int totalTime = totalTimeMap.get(carNum);

            int fee = baseFee;
            if (totalTime > baseMin) {
                int overTime = totalTime - baseMin;
                int unitCount = (overTime + overMin - 1) / overMin;
                fee += unitCount * overFee;
            }
            answer[i] = fee;
        }

        return answer;
    }

    private int getMinutes(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}