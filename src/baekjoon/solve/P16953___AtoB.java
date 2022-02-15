package baekjoon.solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P16953___AtoB {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int target = sc.nextInt();
        int n = sc.nextInt();

        Map<Integer, Integer> d = new HashMap<>();
        visit(d, target, n, 1);
        System.out.println(d.getOrDefault(target, -1));
    }

    private void visit(Map<Integer, Integer> d, int target, int current, int count) {
        if (current < target) {
            return;
        }
        if (d.containsKey(current)) {
            d.put(current, Math.min(count, d.get(current)));
        } else {
            d.put(current, count);
        }
        if (current == target) {
            return;
        }
        if (current % 2 == 0) {
            visit(d, target, current / 2, d.get(current) + 1);
        }
        if ((current - 1) % 10 == 0) {
            visit(d, target, current / 10, d.get(current) + 1);
        }
    }

    public static void main(String[] args) {
        new P16953___AtoB().solve();
    }
}
