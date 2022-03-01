package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class P13549___HideAndSeek3 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int target = Integer.parseInt(s[1]);

        if (target <= n || target == 0) {
            System.out.println(n - target);
            return;
        }

        int[] d = new int[target + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        Queue<Integer> queue = new PriorityQueue<>(
                Comparator.comparing(it -> d[it])
        );
        d[n] = 0;
        queue.add(n);

        while (!queue.isEmpty()) {
            Integer current = queue.poll();

            if (current * 2 > target) {
                d[target] = Math.min(d[target], d[current] + (current * 2 - target));
            } else if (d[current * 2] > d[current]) {
                d[current * 2] = d[current];
                queue.add(current * 2);
            }
            if (current - 1 >= 0 && d[current - 1] > d[current] + 1) {
                d[current - 1] = d[current] + 1;
                queue.add(current - 1);
            }
            if (current + 1 <= target && d[current + 1] > d[current] + 1) {
                d[current + 1] = Math.min(d[current + 1], d[current] + 1);
                queue.add(current + 1);
            }

        }

        System.out.println(d[target]);
    }

    public static void main(String[] args) throws IOException {
        new P13549___HideAndSeek3().solve();
    }
}
