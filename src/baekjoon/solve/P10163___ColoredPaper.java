package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10163___ColoredPaper {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[][] a = new int[1001][1001];
        int[] d = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + w; j++) {
                for (int k = y; k < y + h; k++) {
                    d[a[j][k]]--;
                    a[j][k] = i;
                    d[i]++;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(d[i]).append("\n");
        }
        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P10163___ColoredPaper().solve();
    }
}
