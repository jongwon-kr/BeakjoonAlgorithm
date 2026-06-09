import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int currentHealth = health;
        int currentTime = 0;

        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];

        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            int timeDiff = attackTime - currentTime - 1;

            if (timeDiff > 0) {
                int baseHeal = timeDiff * x;
                int bonusHeal = (timeDiff / t) * y;
                currentHealth = Math.min(maxHealth, currentHealth + baseHeal + bonusHeal);
            }

            currentHealth -= damage;

            if (currentHealth <= 0) {
                return -1;
            }

            currentTime = attackTime;
        }

        return currentHealth;
    }
}