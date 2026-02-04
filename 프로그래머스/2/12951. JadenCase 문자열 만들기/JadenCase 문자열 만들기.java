import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {

        StringBuilder sb = new StringBuilder();
        boolean isChar = false;
        for (char c : s.toCharArray()) {

            if(isChar) {
                if(c == ' '){
                    isChar = false;
                    sb.append(c);
                    continue;
                }
                sb.append(Character.toLowerCase(c));
                continue;
            }

            if(c != ' '){
                isChar = true;
                if(c <= 9){
                    sb.append(c);
                } else {
                    sb.append(Character.toUpperCase(c));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}