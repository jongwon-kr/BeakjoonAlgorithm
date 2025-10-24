import java.util.*;

class Solution {
    public int solution(String arr[]) {
        int numCount = (arr.length / 2) + 1;

        int[] nums = new int[numCount];
        String[] ops = new String[numCount - 1];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                nums[i / 2] = Integer.parseInt(arr[i]);
            } else {
                ops[i / 2] = arr[i];
            }
        }

        int[][] maxDp = new int[numCount][numCount];
        int[][] minDp = new int[numCount][numCount];

        for (int i = 0; i < numCount; i++) {
            maxDp[i][i] = nums[i];
            minDp[i][i] = nums[i];
        }
        for (int len = 2; len <= numCount; len++) {
            for (int i = 0; i <= numCount - len; i++) {
                int j = i + len - 1;

                maxDp[i][j] = Integer.MIN_VALUE;
                minDp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    String op = ops[k];

                    int maxCandidate;
                    int minCandidate;

                    if (op.equals("+")) {
                        maxCandidate = maxDp[i][k] + maxDp[k+1][j];
                        minCandidate = minDp[i][k] + minDp[k+1][j];
                    } else {
                        maxCandidate = maxDp[i][k] - minDp[k+1][j];
                        minCandidate = minDp[i][k] - maxDp[k+1][j];
                    }
                    maxDp[i][j] = Math.max(maxDp[i][j], maxCandidate);
                    minDp[i][j] = Math.min(minDp[i][j], minCandidate);
                }
            }
        }

        return maxDp[0][numCount - 1];
    }
}