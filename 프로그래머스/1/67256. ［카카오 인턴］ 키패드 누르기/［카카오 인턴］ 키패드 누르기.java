import java.util.*;
import java.io.*;

class Solution {

    class Position {
        int x = 0;
        int y = 0;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void changePos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        Position[] keypad = new Position[10];
        keypad[0] = new Position(1, 0);
        keypad[1] = new Position(0, 3);
        keypad[2] = new Position(1, 3);
        keypad[3] = new Position(2, 3);
        keypad[4] = new Position(0, 2);
        keypad[5] = new Position(1, 2);
        keypad[6] = new Position(2, 2);
        keypad[7] = new Position(0, 1);
        keypad[8] = new Position(1, 1);
        keypad[9] = new Position(2, 1);

        Position l = new Position(0, 0);
        Position r = new Position(2, 0);

        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                sb.append("L");
                l.changePos(keypad[n].x, keypad[n].y);
            }
            else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                r.changePos(keypad[n].x, keypad[n].y);
            }
            else {
                int leftDist = getDistance(l, keypad[n]);
                int rightDist = getDistance(r, keypad[n]);

                if (leftDist < rightDist) {
                    sb.append("L");
                    l.changePos(keypad[n].x, keypad[n].y);
                } else if (rightDist < leftDist) {
                    sb.append("R");
                    r.changePos(keypad[n].x, keypad[n].y);
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        l.changePos(keypad[n].x, keypad[n].y);
                    } else {
                        sb.append("R");
                        r.changePos(keypad[n].x, keypad[n].y);
                    }
                }
            }
        }

        return sb.toString();
    }

    int getDistance(Position p1, Position p2) {
        int diffX = Math.abs(p1.x - p2.x);
        int diffY = Math.abs(p1.y - p2.y);
        return diffX + diffY;
    }
}