package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10164___PathOnGrid {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] d = new int[n][m];
        for (int i = 0; i < n; i++) {
            d[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            d[0][i] = 1;
        }

        if (k == 0 || k == n * m) {
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    d[i][j] = d[i - 1][j] + d[i][j - 1];
                }
            }
        } else {
            int ki = k % m == 0 ? k / m - 1 : k / m;
            int kj = k % m == 0 ? m : k % m;

            for (int i = 1; i <= ki; i++) {
                for (int j = 1; j < kj; j++) {
                    d[i][j] = d[i - 1][j] + d[i][j - 1];
                }
            }
            for (int i = ki + 1; i < n; i++) {
                d[i][kj - 1] = d[ki][kj - 1];
            }
            for (int i = kj; i < m; i++) {
                d[ki][i] = d[ki][kj - 1];
            }
            for (int i = ki + 1; i < n; i++) {
                for (int j = kj; j < m; j++) {
                    d[i][j] = d[i - 1][j] + d[i][j - 1];
                }
            }
        }


        System.out.println(d[n - 1][m - 1]);
    }

    public static void main(String[] args) throws IOException {
        new P10164___PathOnGrid().solve();
    }
}
