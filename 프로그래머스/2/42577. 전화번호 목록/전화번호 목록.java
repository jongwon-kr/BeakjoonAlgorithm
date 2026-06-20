import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String[] pb) {
        boolean result = true;
        
        // 배열의 최대 길이가 1000000이기 때문에 이중포문으로 두번 순회하면 시간 초과 발생
        Arrays.sort(pb);    // 사전 순 정렬
        
        for (int i = 0; i < pb.length - 1; i++) {
            if(pb[i + 1].startsWith(pb[i])) {   // 현재 전화번호가 다음번에 올 전화번호의 접두사인지 확인
                result = false;
                break;
            }
        }
        
        return result;
    }
}