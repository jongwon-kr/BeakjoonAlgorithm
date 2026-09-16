import java.util.*;
import java.io.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        // 캐시 크기 만큼 가장 최근 사용된 도시 저장
        // 다음 도시가 캐시에 존재하면 그걸 사용 없으면 가장 오래된 도시 제거
        
        // 실행시간
        int runningTime = 5;
        
        ArrayDeque<String> q = new ArrayDeque<>();
        q.push(cities[0].toLowerCase());
        
        for (int i = 1; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if (q.remove(city)) {
                runningTime += 1;
                q.addLast(city);
            } else {
                runningTime += 5;
                if (q.size() >= cacheSize) {
                    q.pollFirst();
                }
                q.addLast(city);
            }
        }
        
        return runningTime;
    }
}