package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class P02156___Wine {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[n];
        for (int i = 0; i < n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        int[][] d = new int[n][3];
        d[0][0] = 0;
        d[0][1] = wine[0];
        d[0][2] = 0;

        for (int i = 1; i < n; i++) {
            d[i][0] = max(max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
            d[i][1] = d[i - 1][0] + wine[i];
            d[i][2] = d[i - 1][1] + wine[i];
        }

        System.out.println(max(max(d[n - 1][0], d[n - 1][1]), d[n - 1][2]));
    }

    public static void main(String[] args) throws IOException {
        new P02156___Wine().solve();
    }
}
