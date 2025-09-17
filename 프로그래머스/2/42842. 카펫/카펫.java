import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {

        int h;
        int w = 3;
        while(true){

            h = 3;
            while(h <= brown/2 - 1){

                if(((h - 2) * (w - 2)) == yellow && ((w - 2) * 2 + h * 2) == brown){
                    // 1줄 사각형 공식
                    return new int[]{h, w};
                }
                h++;
            }
            if(w <= brown/2 - 1){
                w++;
            }
        }

    }
}