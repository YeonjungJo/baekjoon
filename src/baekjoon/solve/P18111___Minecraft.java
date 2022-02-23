package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P18111___Minecraft {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);

        Map<Integer, Integer> counts = new HashMap<>();
        int sum = 0;
        int maxKey = 0;
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int a = Integer.parseInt(tmp[j]);
                int count = counts.getOrDefault(a, 0);
                counts.put(a, count + 1);
                sum += a;
                maxKey = Math.max(maxKey, a);
            }
        }

        long minCost = Integer.MAX_VALUE;
        int target = 0;
        int possibleHeight = Math.min((sum + b) / (n * m), 256);

        for (int i = Math.min(possibleHeight, maxKey); i >= 0; i--) {
            long result = calc(counts, i);
            if (result <= minCost) {
                if (result == minCost) {
                    target = Math.max(i, target);
                } else {
                    target = i;
                }
                minCost = result;
            } else {
                break;
            }
        }

        System.out.print(minCost + " " + target);
    }

    private long calc(Map<Integer, Integer> counts, int target) {
        long result = 0;
        for (Entry<Integer, Integer> i : counts.entrySet()) {
            int diff = target - i.getKey();
            if (diff > 0) {
                result += (long) diff * i.getValue();
            } else if (diff < 0) {
                result += -2L * diff * i.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        new P18111___Minecraft().solve();
    }
}