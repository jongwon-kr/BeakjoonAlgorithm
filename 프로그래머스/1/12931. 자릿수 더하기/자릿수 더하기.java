import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            int lastNum = n % 10;
            sum += lastNum;
            n /= 10;
        }

        return sum;
    }
}