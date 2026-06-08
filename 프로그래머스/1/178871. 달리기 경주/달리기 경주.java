import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> playerMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {

            String callPlayer = callings[i];
            int playerPosition = playerMap.get(callPlayer);
            String prevPlayer = players[playerPosition - 1];

            playerMap.put(callPlayer, playerPosition - 1);
            playerMap.put(prevPlayer, playerPosition);

            players[playerPosition] = players[playerPosition - 1];
            players[playerPosition - 1] = callPlayer;
        }

        return players;
    }
}