import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] nums;
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        nums = new int[N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        bw.write(getAverage() + "\n");
        bw.write(getMiddleValue()+"\n");
        bw.write(getMaxContainNum()+"\n");
        bw.write(getRange()+"\n");
        bw.flush();
        bw.close();
        br.close();
    }

    static int getAverage(){
        double avg = 0;
        double sum = 0;
        for(int i = 0; i < N; i++){
            sum += nums[i];
        }
        avg = Math.round(sum / N);
        return (int) avg;
    }

    static int getMiddleValue(){
        int middleValue = 0;
        middleValue = nums[N/2];

        return middleValue;
    }

    static int getMaxContainNum(){
        int mCNum = 0;

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxFrequency = 0;
        for (int value : map.values()) {
            maxFrequency = Math.max(maxFrequency, value);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                list.add(entry.getKey());
            }
        }

        list.sort(Comparator.comparingInt((Integer i) -> i));


        if (list.size() >= 2) {
            mCNum = list.get(1);
        } else {
            mCNum = list.get(0);
        }

        return mCNum;
    }

    static int getRange(){
        int range = 0;
        int max = nums[N - 1];
        int min = nums[0];

        range = Math.abs(max - min);

        return range;
    }

}
