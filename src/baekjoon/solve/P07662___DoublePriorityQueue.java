package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P07662___DoublePriorityQueue {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static final String INSERT = "I";
    public static final String MAX = "1";

    private void run() throws IOException {
        int t = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            stringBuilder.append(solve()).append("\n");
        }
        System.out.print(stringBuilder);
    }

    private String solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> natural = new PriorityQueue<>();
        PriorityQueue<Integer> reversed = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            if (s[0].equals(INSERT)) {
                int number = Integer.parseInt(s[1]);
                natural.add(number);
                reversed.add(number);
                map.put(number, map.getOrDefault(number, 0) + 1);
            } else {
                if (!map.isEmpty()) {
                    if (s[1].equals(MAX)) {
                        remove(reversed, map);
                    } else {
                        remove(natural, map);
                    }
                }
            }
        }

        if (map.isEmpty()) {
            return "EMPTY";
        }

        int max = remove(reversed, map);
        if (map.isEmpty()) {
            return max + " " + max;
        }
        return max + " " + remove(natural, map);
    }

    private int remove(PriorityQueue<Integer> queue, Map<Integer, Integer> map) {
        int num;
        while (true) {
            num = queue.poll();
            int count = map.getOrDefault(num, 0);
            if (count == 0) {
                continue;
            }
            if (count == 1) {
                map.remove(num);
            } else {
                map.put(num, count - 1);
            }
            break;
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        new P07662___DoublePriorityQueue().run();
    }
}
