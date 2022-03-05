package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P09421___PrimeFullNumber {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static final int OK = 1;
    public static final int FAILED = 2;

    private void solve() throws IOException {

        boolean[] np = new boolean[1000001];
        np[0] = np[1] = true;

        for (int i = 2; i * i < np.length; i++) {
            if (!np[i]) {
                for (int j = i * i; j < np.length; j = j + i) {
                    np[j] = true;
                }
            }
        }

        int n = Integer.parseInt(br.readLine());
        int[] d = new int[1000001];
        d[1] = OK;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (!np[i]) {
                if (validate(i, d)) {
                    stringBuilder.append(i).append("\n");
                }
            }
        }

        System.out.print(stringBuilder);
    }

    private boolean validate(int n, int[] d) {
        Set<Integer> s = new HashSet<>();
        while (true) {
            if (s.contains(n)) {
                s.forEach(it -> d[it] = FAILED);
                return false;
            }
            s.add(n);
            if (d[n] == OK) {
                s.forEach(it -> d[it] = OK);
                return true;
            }
            if (d[n] == FAILED) {
                s.forEach(it -> d[it] = FAILED);
                return false;
            }
            n = calculate(n);
        }
    }

    private int calculate(int n) {
        int result = 0;
        while (n > 0) {
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        new P09421___PrimeFullNumber().solve();
    }
}
