import java.util.*;
import java.io.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLenSec = toSeconds(video_len);
        int posSec = toSeconds(pos);
        int opStartSec = toSeconds(op_start);
        int opEndSec = toSeconds(op_end);

        if (posSec >= opStartSec && posSec <= opEndSec) {
            posSec = opEndSec;
        }

        for (String command : commands) {
            if (command.equals("next")) {
                posSec += 10;
                if (posSec > videoLenSec) {
                    posSec = videoLenSec;
                }
            } else if (command.equals("prev")) {
                posSec -= 10;
                if (posSec < 0) {
                    posSec = 0;
                }
            }

            if (posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }
        }

        return String.format("%02d:%02d", posSec / 60, posSec % 60);
    }

    private int toSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }
}