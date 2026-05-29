import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int pickPosition = moves[i];
            int pickDoll = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][pickPosition - 1] != 0) {
                    pickDoll = board[j][pickPosition - 1];
                    board[j][pickPosition - 1] = 0;
                    break;
                }
            }
            if (pickDoll != 0) {
                if (!stack.isEmpty() && stack.peek() == pickDoll) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(pickDoll);
                }
            }
        }
        return answer;
    }
}