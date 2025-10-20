import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int left = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            int curPrice = prices[i];
            int cnt = 1;
            left = i + 1;
            for(int j = left; j < prices.length - 1; j++){
                if(curPrice <= prices[j]){
                    cnt++;
                } else {
                    break;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}