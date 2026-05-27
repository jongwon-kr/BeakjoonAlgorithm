import java.util.*;
import java.io.*;

class Solution {

    class Stage {
        int id;
        double failureRate;

        public Stage(int id, double failureRate) {
            this.id = id;
            this.failureRate = failureRate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] challenging = new int[N + 2];
        for (int stage : stages) {
            challenging[stage]++;
        }

        List<Stage> stageList = new ArrayList<>();
        int totalPlayers = stages.length;

        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                stageList.add(new Stage(i, 0.0));
            } else {
                double rate = (double) challenging[i] / totalPlayers;
                stageList.add(new Stage(i, rate));
                totalPlayers -= challenging[i];
            }
        }

        stageList.sort((a, b) -> {
            if (Double.compare(b.failureRate, a.failureRate) == 0) {
                return Integer.compare(a.id, b.id);
            }
            return Double.compare(b.failureRate, a.failureRate);
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).id;
        }

        return answer;
    }
}