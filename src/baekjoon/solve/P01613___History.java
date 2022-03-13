package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01613___History {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int BEFORE = -1;
    public static final int AFTER = 1;
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
            d[a][b] = BEFORE;
            d[b][a] = AFTER;
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

        StringBuilder stringBuilder = new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            stringBuilder.append(d[from][to]).append("\n");
        }

        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P01613___History().solve();
    }
}
