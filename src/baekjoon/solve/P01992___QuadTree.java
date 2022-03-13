package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01992___QuadTree {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        char[][] a = new char[n][n];

        for (int i = 0; i < n; i++) {
            a[i] = br.readLine().toCharArray();
        }

        System.out.println(check(a, 0, 0, n));
    }

    private String check(char[][] a, int y, int x, int n) {
        char tmp = a[y][x];
        for (int i = y; i < y + n; i++) {
            for (int j = x; j < x + n; j++) {
                if (a[i][j] != tmp) {
                    return "(" +
                            check(a, y, x, n / 2)
                            + check(a, y, x + n / 2, n / 2)
                            + check(a, y + n / 2, x, n / 2)
                            + check(a, y + n / 2, x + n / 2, n / 2)
                            + ")";

                }
            }
        }
        return String.valueOf(tmp);
    }

    public static void main(String[] args) throws IOException {
        new P01992___QuadTree().solve();
    }
}
