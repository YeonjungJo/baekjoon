package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11444___Fibonacci6 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        long n = Long.parseLong(br.readLine());

        if (n < 2) {
            System.out.println(n);
            return;
        }

        long[][] a = {{1, 1}, {1, 0}};

        long[][] result = process(a, n);

        System.out.print(result[1][0]);
    }

    private long[][] process(long[][] a, long b) {
        if (b % 2 == 0) {
            long[][] tmp = process(a, b / 2);
            return calculate(tmp, tmp);
        } else if (b == 1) {
            return a;
        }

        long[][] tmp = process(a, b / 2);
        return calculate(calculate(tmp, tmp), a);
    }

    private long[][] calculate(long[][] a, long[][] b) {
        long[][] result = new long[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                long tmp = 0;
                for (int k = 0; k < a.length; k++) {
                    tmp += a[i][k] * b[k][j];
                }
                result[i][j] = tmp % 1000000007;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        new P11444___Fibonacci6().solve();
    }
}
