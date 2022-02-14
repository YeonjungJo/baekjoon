package baekjoon.solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P01003___FibonacciFunction {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();

        Map<Integer, Integer> fibonacci = new HashMap<>();
        fibonacci.put(0, 1);
        fibonacci.put(1, 0);
        int maxKey = 1;

        for (int i = 0; i < n; i++) {
            int target = sc.nextInt();
            if (target + 1 > maxKey) {
                for (int key = maxKey + 1; key <= target + 1; key++) {
                    fibonacci.put(key, fibonacci.get(key - 1) + fibonacci.get(key - 2));
                }
            }
            System.out.println(fibonacci.get(target) + " " + fibonacci.get(target + 1));
        }
    }

    public static void main(String[] args) {
        new P01003___FibonacciFunction().solve();
    }
}
