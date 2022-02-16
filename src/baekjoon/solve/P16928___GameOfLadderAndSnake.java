package baekjoon.solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P16928___GameOfLadderAndSnake {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int ladder = sc.nextInt();
        int snake = sc.nextInt();

        Map<Integer, Integer> portal = new HashMap<>();
        for (int i = 0; i < ladder + snake; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            portal.put(from, to);
        }

        int[] d = new int[101];
        for (int i = 1; i < 100; i++) {
            if (portal.containsKey(i)) {
                int tmp = d[portal.get(i)];
                d[portal.get(i)] = d[portal.get(i)] == 0 ? d[i] : Math.min(d[portal.get(i)], d[i]);
                if (portal.get(i) < i) {
                    if (tmp > d[i]) {
                        i = portal.get(i) - 1;
                    }
                }
            } else {
                for (int j = 1; j <= 6 && i + j <= 100; j++) {
                    d[i + j] = d[i + j] == 0 ? d[i] + 1 : Math.min(d[i + j], d[i] + 1);
                }
            }

        }

        System.out.println(d[100]);
    }

    public static void main(String[] args) {
        new P16928___GameOfLadderAndSnake().solve();
    }
}
