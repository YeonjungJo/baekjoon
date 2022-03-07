package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10830___MatrixSquared {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long[][] a = new long[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Long.parseLong(st.nextToken());
            }
        }

        long[][] result = process(a, b);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stringBuilder.append(result[i][j] % 1000).append(" ");
            }
            stringBuilder.append("\n");
        }

        System.out.print(stringBuilder);
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
                result[i][j] = tmp % 1000;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        new P10830___MatrixSquared().solve();
    }
}
