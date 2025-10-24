import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number){
            return 1;
        }
        List<Set<Integer>> dp = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            dp.add(new HashSet<>());
        }

        // N을 1번 사용했을 때
        dp.get(1).add(N);
        for(int i = 2; i < 9; i++){
            String numStr = "";
            for(int j = 0; j < i; j++) {
                numStr += String.valueOf(N);
            }
            int fNum = Integer.parseInt(numStr);
            if(fNum == number){
                return i;
            }
            // 이어 붙이기
            dp.get(i).add(fNum);

            int left = 1;
            int right = i - 1;
            while(right >= 1){
                for(int n1 : dp.get(left)){
                   for(int n2 : dp.get(right)){
                        if(n1 + n2 == number || n1 - n2 == number || n1 * n2 == number){
                            return i;
                        }
                        dp.get(i).add(n1 + n2);
                        dp.get(i).add(n1 - n2);
                        dp.get(i).add(n1 * n2);
                        if(n2 != 0){
                            if(n1 / n2 == number){
                                return i;
                            }
                            dp.get(i).add(n1 / n2);
                        }
                   }
                }
                left++;
                right--;
            }
        }
        return -1;
    }
}