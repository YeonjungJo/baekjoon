package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P02660___PickChairman {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int UNKNOWN = 999999;

    private void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] d = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                d[i][j] = UNKNOWN;
            }
        }

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == b && a == -1) {
                break;
            }
            d[a][b] = 1;
            d[b][a] = 1;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j) {
                        continue;
                    }
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        int min = UNKNOWN;
        List<Integer> candidates = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int tmp = 0;
            for (int j = 1; j <= n; j++) {
                tmp = Math.max(tmp, d[i][j]);
            }
            if (tmp < min) {
                min = tmp;
                candidates = new ArrayList<>();
                candidates.add(i);
            } else if (tmp == min) {
                candidates.add(i);
            }
        }

        System.out.println(min + " " + candidates.size());
        System.out.println(candidates.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static void main(String[] args) throws IOException {
        new P02660___PickChairman().solve();
    }
}
