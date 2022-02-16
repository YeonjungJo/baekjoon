package baekjoon.todo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class T18111___Minecraft {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int b = sc.nextInt();

        Map<Integer, Integer> counts = new HashMap<>();
        int sum = 0;
        int maxKey = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                int count = counts.getOrDefault(a, 0);
                counts.put(a, count + 1);
                sum += a;
                maxKey = Math.max(maxKey, a);
            }
        }

        int minCost = Integer.MAX_VALUE;
        int target = 0;
        int possibleHeight = sum + b / (n * m);

        for (int i = Math.min(possibleHeight, maxKey); i >= 0; i--) {
            int result = calc(counts, i);
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

    private int calc(Map<Integer, Integer> counts, int target) {
        int result = 0;
        for (Entry<Integer, Integer> i : counts.entrySet()) {
            int diff = target - i.getKey();
            if (diff > 0) {
                result += diff * i.getValue();
            } else if (diff < 0) {
                result += -2 * diff * i.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new T18111___Minecraft().solve();
    }
}