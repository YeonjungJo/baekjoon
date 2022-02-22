package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P09465___Sticker {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void run() throws IOException {
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            solve();
        }
    }

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[2][n + 1];
        int[][] d = new int[2][n + 1];
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        d[0][1] = a[0][1];
        d[1][1] = a[1][1];
        for (int i = 2; i <= n; i++) {
            d[0][i] = Math.max(d[1][i - 1], d[1][i - 2]) + a[0][i];
            d[1][i] = Math.max(d[0][i - 1], d[0][i - 2]) + a[1][i];
        }

        System.out.println(Math.max(d[0][n], d[1][n]));
    }

    public static void main(String[] args) throws IOException {
        new P09465___Sticker().run();
    }
}
