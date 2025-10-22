import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int changeCnt = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; i++){
            int num = lost[i];
            for(int j = 0; j < reserve.length; j++){
                if(num == reserve[j]){
                    reserve[j] = -1;
                    lost[i] = -1;
                    changeCnt++;
                    break;
                }
            }
        }

        for(int i : lost){
            for(int j = 0; j < reserve.length; j++){
                if(i - 1 == reserve[j]){
                    changeCnt++;
                    reserve[j] = -1;
                    break;
                }
                if(i + 1 == reserve[j]){
                    changeCnt++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        int answer = n - lost.length + changeCnt;
        return answer;
    }
}