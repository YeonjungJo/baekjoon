package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02447___Star10 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[][] a = new boolean[n][n];
        partition(a, 0, 0, n, true);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stringBuilder.append(a[i][j] ? "*" : " ");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

    private void partition(boolean[][] a, int i, int j, int n, boolean isPrintable) {
        if (n == 1) {
            a[i][j] = isPrintable;
            return;
        }
        int next = n / 3;
        partition(a, i, j, next, isPrintable);
        partition(a, i + next, j, next, isPrintable);
        partition(a, i + 2 * next, j, next, isPrintable);
        partition(a, i, j + next, next, isPrintable);
        partition(a, i + next, j + next, next, false);
        partition(a, i + 2 * next, j + next, next, isPrintable);
        partition(a, i, j + 2 * next, next, isPrintable);
        partition(a, i + next, j + 2 * next, next, isPrintable);
        partition(a, i + 2 * next, j + 2 * next, next, isPrintable);
    }

    public static void main(String[] args) throws IOException {
        new P02447___Star10().solve();
    }
}
