class Solution {
    public int solution(int num) {
        long n = num; 
        int cnt = 0;
        
        if (n == 1) {
            return 0;
        }
        
        while (cnt < 500) { 
            n = collatz(n);
            cnt++;
            if (n == 1) {
                break;
            }
        }
        
        if (n != 1) {
            return -1;
        }
        
        return cnt;
    }
    
    long collatz(long i) {
        if (i % 2 == 0) {
            return i / 2;
        } else {
            return (i * 3) + 1;
        }
    }
}