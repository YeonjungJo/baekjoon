package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09663___NQueen {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] d = new int[n];
        System.out.println(search(n, d, 0));
    }

    private int search(int n, int[] d, int current) {
        if (current == n) {
            return 1;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            d[current] = i;
            if (check(d, current)) {
                count += search(n, d, current + 1);
            }
        }

        return count;
    }

    private boolean check(int[] d, int target) {
        for (int i = 0; i < target; i++) {
            if (Math.abs(d[target] - d[i]) == target - i) {
                return false;
            }
            if (d[i] == d[target]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        new P09663___NQueen().solve();
    }
}
