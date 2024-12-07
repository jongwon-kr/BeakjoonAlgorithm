import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int U = sc.nextInt();
		
        // L 자체의 값을 잃지 않기 위해서 L-1 을 넣어줬다.
		System.out.println(getSum(U) - getSum(L - 1));
	}
	
	public static long getSum(int a) {
   		// 값을 저장할 변수
		long sum = 0;
		// 0~9까지 개수를 카운팅할 배열
		long[] cnt = new long[10];
		
		// 0: 1의 자리, 1: 10의 자리, 2: 100의 자리 ...
		int[] digit = new int[10];
        
		// 각 자리수를 배열에 저장
        int temp = a;
		int idx = 0;
		while(temp != 0) {
			digit[idx++] = temp%10;
			temp /= 10;
		}
		
		// 임시 저장. 추후에 뒷 자리수를 구할 때, 사용
		int aside = a;
		// 일의 자리부터 시작
		int s = 0;
		while(a != 0) {
        	// 카운팅하려는 자리의 앞부분
			int n = a/10;
			
			// 일의 자리일 경우
			if(s == 0) {
				for(int i=1; i<= digit[s]; i++) {
                	// ex) 134의 경우, n=13
                    // 일의 자리에서 0~4까지는 14번씩 나온다
					cnt[i] += n + 1; 
				}
				for(int i=digit[s] + 1; i<10; i++) {
                	// ex) 134의 경우, n=13
                    // 일의 자리에서 5~9까지는 13번씩 나온다
					cnt[i] += n;
				}
			} else {
				for(int i=1; i<10; i++) {
					if(i < digit[s]) {
                    	// ex) 1234에서 백의 자리 계산시, n=1
                        // 백의 자리에서 0~1까지는
                        // 천의 자리가 0과1, 십의 자리 0~9, 일의 자리 0~9
                        // (1+1) * 10 * 10
						cnt[i] += (n + 1) * Math.pow(10, s);
					} else if(i == digit[s]) {
                    	// ex) 1234에서 백의 자리 계산시, n=1
                        // 백의 자리에서 2는
                        // 천의 자리가 0, 십의 자리 0~9, 일의 자리 0~9
                        // 1 * 10 * 10
                        // 추가적으로
                        // 천의자리가 1, 뒷 부분은 00~34
                        // 1 * 35
						cnt[i] += n * Math.pow(10, s) + (aside % Math.pow(10, s) + 1);
					} else {
                    	// ex) 1234에서 백의 자리 계산시, n=1
                        // 백의 자리에서 3~9는
                        // 천의 자리가 0, 십의 자리 0~9, 일의 자리 0~9
						cnt[i] += n * Math.pow(10, s);
					}
				}
			}
            // 자리수 증가
			s++;
			a /= 10;
		}
		
        // 모든 정수의 각 자리의 합 구하기
		for(int i=1; i<10; i++) {
			sum += cnt[i] * i;
		}
		
		return sum;
	}
}