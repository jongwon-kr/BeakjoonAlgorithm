import java.util.*;

class Solution {
    public int solution(String numbers) {
        HashSet<Integer> numberSet = new HashSet<>();
        int answer = 0;
        char[] digits = numbers.toCharArray();
        boolean[] visited = new boolean[digits.length];


        dfs("", digits, visited, numberSet);
        for (int i : numberSet) {
            if (isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }

    public void dfs(String currentNumber, char[] digits, boolean[] visited, HashSet<Integer> numberSet) {
        if (!currentNumber.equals("")) {
            numberSet.add(Integer.parseInt(currentNumber));
        }

        for (int i = 0; i < digits.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(currentNumber + digits[i], digits, visited, numberSet);
                visited[i] = false;

            }
        }
    }


    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}