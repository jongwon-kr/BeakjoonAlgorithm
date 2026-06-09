import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        int r = 0;
        int c = 0;

        for (int i = 0; i < H; i++) {
            if (park[i].contains("S")) {
                r = i;
                c = park[i].indexOf("S");
                break;
            }
        }

        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0];
            int distance = Integer.parseInt(parts[1]);

            int tempR = r;
            int tempC = c;
            boolean canMove = true;

            for (int i = 0; i < distance; i++) {
                if (direction.equals("E")) tempC++;
                else if (direction.equals("W")) tempC--;
                else if (direction.equals("S")) tempR++;
                else if (direction.equals("N")) tempR--;

                if (tempR < 0 || tempR >= H || tempC < 0 || tempC >= W) {
                    canMove = false;
                    break;
                }

                if (park[tempR].charAt(tempC) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                r = tempR;
                c = tempC;
            }
        }

        return new int[]{r, c};
    }
}