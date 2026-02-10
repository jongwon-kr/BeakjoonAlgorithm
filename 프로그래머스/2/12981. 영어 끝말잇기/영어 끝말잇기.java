import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = {0, 0};
        int curSeq = 0;
        int stage = 1;
        ArrayList<String> answers = new ArrayList<>();

        for(String word : words) {
            curSeq++;

            if(checkWord(answers, word)){
                result[0] = curSeq;
                result[1] = stage;
                break;
            }
            answers.add(word);

            if(curSeq == n){
                curSeq = 0;
                stage++;
            }
        }

        return result;
    }

    public Boolean checkWord(ArrayList<String> answers, String curWord) {

        boolean result = false;

        if(answers.isEmpty()){
            return result;
        }

        if(answers.contains(curWord)){
            result = true;
        }

        String prevWord = answers.get(answers.size() - 1);
        if(prevWord.charAt(prevWord.length() - 1) != curWord.charAt(0)){
            result = true;
        }

        return result;
    }
}