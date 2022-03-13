package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10159___Scale {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int HEAVY = 1;
    public static final int LIGHT = -1;
    public static final int UNKNOWN = 0;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] d = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            d[a][b] = HEAVY;
            d[b][a] = LIGHT;
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
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                if (d[i][j] == UNKNOWN) {
                    count++;
                }
            }
            stringBuilder.append(count).append("\n");
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P10159___Scale().solve();
    }
}
