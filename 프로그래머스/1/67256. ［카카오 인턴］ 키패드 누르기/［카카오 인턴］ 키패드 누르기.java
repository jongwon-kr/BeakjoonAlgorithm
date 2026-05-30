import java.util.*;

class Solution {
    int[][] keypadPos = {
        {3, 1}, // 0
        {0, 0}, // 1
        {0, 1}, // 2
        {0, 2}, // 3
        {1, 0}, // 4
        {1, 1}, // 5
        {1, 2}, // 6
        {2, 0}, // 7
        {2, 1}, // 8
        {2, 2}  // 9
    };
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        int[] leftPos = {3, 0};
        int[] rightPos = {3, 2};
        
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                leftPos = keypadPos[num];
                
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                rightPos = keypadPos[num];
                
            } else {
                int[] targetPos = keypadPos[num];
                
                int leftDist = getDistance(leftPos, targetPos);
                int rightDist = getDistance(rightPos, targetPos);
                
                if (leftDist < rightDist) {
                    sb.append("L");
                    leftPos = targetPos;
                } else if (leftDist > rightDist) {
                    sb.append("R");
                    rightPos = targetPos;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftPos = targetPos;
                    } else {
                        sb.append("R");
                        rightPos = targetPos;
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private int getDistance(int[] pos1, int[] pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
}