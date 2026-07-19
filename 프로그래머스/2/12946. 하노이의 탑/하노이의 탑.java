import java.util.*;
import java.io.*;

class Solution {
    
    List<int[]> list;
    
    public int[][] solution(int n) {
        
        list = new ArrayList<>();
        
        hanoi(n, 1, 2, 3);
        
        return list.toArray(new int[0][]);
    }
    
    public void hanoi(int n, int start, int mid, int to) {
        
        if (n == 1) {
            list.add(new int[]{start, to});
            return;
        }
        
        // n-1개의 원판을 보조 기둥(mid)으로 이동
        hanoi(n - 1, start, to, mid);
        // 가장 큰 원판을 도착 기둥(to)으로 이동
        list.add(new int[]{start, to});
        // 보조 기둥(mid)에 있던 n-1개의 원판을 도착 기둥(to)으로 이동
        hanoi(n - 1, mid, start, to);
    }
}