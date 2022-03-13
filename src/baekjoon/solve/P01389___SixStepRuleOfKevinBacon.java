package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01389___SixStepRuleOfKevinBacon {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] d = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    d[i][j] = 0;
                else
                    d[i][j] = 999999;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            d[a][b] = 1;
            d[b][a] = 1;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        long sum = Long.MAX_VALUE;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 0;
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                tmp += d[i][j];
            }
            if (tmp < sum) {
                sum = tmp;
                result = i;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new P01389___SixStepRuleOfKevinBacon().solve();
    }
}
