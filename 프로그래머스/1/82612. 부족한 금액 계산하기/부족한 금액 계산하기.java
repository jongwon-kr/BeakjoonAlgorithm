import java.util.*;
import java.io.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;

        for (int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }

        if ((long) money >= totalPrice) {
            return 0;
        }

        answer = Math.abs(money - totalPrice);
        return answer;
    }
}