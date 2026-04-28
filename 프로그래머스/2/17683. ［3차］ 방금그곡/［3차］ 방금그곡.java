import java.util.*;
import java.io.*;

class Solution {

    static class MusicInfo {

        int playTime = 0;
        String name = "";
        String melody = "";

        public MusicInfo(int playTime, String name, String melody) {
            this.playTime = playTime;
            this.name = name;
            this.melody = melody;
        }
    }

    public String solution(String m, String[] musicinfos) {
        String resultMusicName = "(None)";
        ArrayList<MusicInfo> musicInfoList = new ArrayList<>();

        // 음악 정보 리스트에 데이터 추가
        for(String musicInfo : musicinfos) {
            String[] mAttrs = musicInfo.split(",");
            musicInfoList.add(new MusicInfo(calPlayTime(mAttrs[0], mAttrs[1]), mAttrs[2], mAttrs[3]));
        }

        int maxPlayTime = 0;
        for (MusicInfo mi : musicInfoList) {

            String changePm = changeMelody(m);
            String changeMIm = changeMelody(mi.melody);

            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < mi.playTime; i++) {
                sb.append(changeMIm.charAt(i % changeMIm.length()));
            }
            String realMelody = sb.toString();

            if (realMelody.contains(changePm)) {
                if (mi.playTime > maxPlayTime) {
                    maxPlayTime = mi.playTime;
                    resultMusicName = mi.name;
                }
            }
        }

        return resultMusicName;
    }

    // 재생시간 계산 메소드
    private int calPlayTime(String startTime, String endTime) {

        int sTime = Integer.parseInt(startTime.split(":")[0]) * 60 + Integer.parseInt(startTime.split(":")[1]);
        int eTime = Integer.parseInt(endTime.split(":")[0]) * 60 + Integer.parseInt(endTime.split(":")[1]);

        return eTime - sTime;
    }

    // 멜로디 비교 메소드
    private boolean isCheckMusic(String m, String melody) {

        boolean isSame = false;
        char start = m.charAt(0);
        int sIdx = melody.indexOf(start);
        int cnt = 0;
        if (sIdx >= 0) {

            for(int i = 0; i < m.length(); i++) {
                if(sIdx >= melody.length()) {
                    sIdx = 0;
                }

                if (m.charAt(i) == melody.charAt(sIdx)) {
                   cnt++;
                }

                sIdx++;
            }
            if (cnt == m.length()) {
                isSame = true;
            }
        }

        return isSame;
    }

    // 올림음 소문자로 치환 메소드
    private String changeMelody(String m) {
        return m.replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a")
                .replace("B#", "b");
    }
}