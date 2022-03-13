package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P02458___HeightSequence {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int TALLER = 1;
    public static final int SMALLER = -1;
    public static final int UNKNOWN = 0;

    private void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] d = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            d[a][b] = TALLER;
            d[b][a] = SMALLER;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (d[i][j] != UNKNOWN) {
                        continue;
                    }
                    if (d[i][k] != UNKNOWN && d[i][k] == d[k][j]) {
                        d[i][j] = d[i][k];
                    }
                }
            }
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            boolean known = true;
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                if (d[i][j] == UNKNOWN) {
                    known = false;
                    break;
                }
            }
            if (known) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new P02458___HeightSequence().solve();
    }
}
