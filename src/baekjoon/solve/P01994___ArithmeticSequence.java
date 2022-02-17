package baekjoon.solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P01994___ArithmeticSequence {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        int max = 0;
        for (Integer i : map.keySet()) {
            for (Integer j : map.keySet()) {
                int diff = j - i;
                if (diff == 0) {
                    max = Math.max(map.get(i), max);
                    continue;
                }
                if (diff < 0) {
                    continue;
                }

                int k = 2;
                while (map.containsKey(i + diff * k)) {
                    k++;
                }
                max = Math.max(k, max);
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        new P01994___ArithmeticSequence().solve();
    }
}
