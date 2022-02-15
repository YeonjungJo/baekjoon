package baekjoon.solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P09375___FashionKing {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            testcase();
        }
    }

    private void testcase() {
        int n = sc.nextInt();
        Map<String, Integer> input = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String type = sc.next();
            int count = 1 + input.getOrDefault(type, 0);
            input.put(type, count);
        }

        int result = input.values()
                .stream()
                .map(it -> it + 1)
                .reduce(1, (a, b) -> a * b);
        System.out.println(result - 1);
    }


    public static void main(String[] args) {
        new P09375___FashionKing().solve();
    }
}
