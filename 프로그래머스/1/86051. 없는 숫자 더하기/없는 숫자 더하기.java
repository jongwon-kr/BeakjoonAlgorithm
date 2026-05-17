class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        boolean[] check = new boolean[10];
        
        for (int i : numbers) {
            check[i] = true;
        }
        
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                sum += i;
            }
        }
        
        return sum;
    }
}