class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
        int cntP = 0;
        int cntY = 0;
        
        String[] strArr = s.split("");
        for (String str : strArr) {
            if (str.equals("p")) {
                cntP++;
            } else if (str.equals("y")) {
                cntY++;
            }
        }
        
        if (cntP == cntY) {
           answer = true; 
        } else {
            answer = false;
        }
        
        if (cntP == 0 && cntY == 0) {
            answer = true;
        }

        return answer;
    }
}