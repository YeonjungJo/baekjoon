package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11404___Floyd {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int NOT_VISIT = 999_999_999;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] d = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    d[i][j] = 0;
                } else {
                    d[i][j] = NOT_VISIT;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            d[a][b] = Math.min(d[a][b], w);
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                stringBuilder.append(d[i][j] == NOT_VISIT ? 0 : d[i][j]);
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }

        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P11404___Floyd().solve();
    }
}
