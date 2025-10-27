class Solution {
    
    int min = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        boolean find = dfs(words, begin, target, 0, visited);

        if(find){
            return min;
        }
        return 0;
    }

    public boolean dfs(String[] words, String cWord, String target, int depth, boolean[] visited) {

        if(cWord.equals(target)) {
            min = Math.min(min, depth);
            return true;
        }

        boolean found = false;
        for(int i = 0; i < words.length; i++) {
            if(!visited[i] && calDiffChar(cWord, words[i]) == 1) {
                visited[i] = true;
                if (dfs(words, words[i], target, depth + 1, visited)) {
                    found = true;
                }
                visited[i] = false;
            }
        }
        return found;
    }

    public static int calDiffChar(String target, String word) {
        int diffCnt = 0;
        for(int i = 0; i < target.length(); i++) {
            if(target.charAt(i) != word.charAt(i)){
                diffCnt++;
            }
        }
        return diffCnt;
    }
}