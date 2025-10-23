import java.util.*;

class Solution {
    int[] parent;

    public int find(int i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i] = find(parent[i]);
    }

    public void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {
            if (rootA < rootB) {
                parent[rootB] = rootA;
            } else {
                parent[rootA] = rootB;
            }
        }
    }

    public int solution(int n, int[][] costs) {
        int totalCost = 0;

        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        Arrays.sort(costs, (a, b) -> a[2] - b[2]);

        for (int[] cost : costs) {
            int from = cost[0];
            int to = cost[1];
            int costValue = cost[2];

            if (find(from) != find(to)) {
                union(from, to);
                totalCost += costValue;
            }
        }

        return totalCost;
    }
}