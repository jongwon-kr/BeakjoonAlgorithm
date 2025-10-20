import java.util.*;

class Solution {
    
    class Job {
        int num;
        int reqTime;
        int finTime;

        public Job(int num, int reqTime, int finTime) {
            this.num = num;
            this.reqTime = reqTime;
            this.finTime = finTime;
        }
    }

    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        Queue<Job> q = new LinkedList<>();
        for (int i = 0; i < jobs.length; i++) {
            q.add(new Job(i, jobs[i][0], jobs[i][1]));
        }

        Queue<Job> pq = new PriorityQueue<>(Comparator.comparingInt(job -> job.finTime));
        
        int totalResponseTime = 0; 
        int count = 0;             
        int currentTime = 0;       
        
        while (count < jobs.length) {
            while (!q.isEmpty() && q.peek().reqTime <= currentTime) {
                pq.add(q.poll());
            }
            
            if (!pq.isEmpty()) {
                Job currentJob = pq.poll();
                currentTime += currentJob.finTime;
                totalResponseTime += currentTime - currentJob.reqTime;
                count++;
            } else {
                currentTime = q.peek().reqTime;
            }
        }
        return totalResponseTime / jobs.length;
    }
}