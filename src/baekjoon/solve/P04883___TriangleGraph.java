package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P04883___TriangleGraph {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int WIDTH = 3;

    int[] di = {0, -1, -1, -1};
    int[] dj = {-1, 1, 0, -1};

    private void solve() throws IOException {
        for (int testcase = 1; ; testcase++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                return;
            }
            int[][] a = new int[n][WIDTH];
            int[][] d = new int[n][WIDTH];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < WIDTH; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                    d[i][j] = Integer.MAX_VALUE;
                }
            }

            d[0][1] = a[0][1];
            d[0][2] = a[0][1] + a[0][2];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < WIDTH; j++) {
                    int min = Integer.MAX_VALUE;
                    for (int k = 0; k < 4; k++) {
                        int beforeI = i + di[k];
                        int beforeJ = j + dj[k];
                        if (beforeI < 0 || beforeJ < 0 || beforeJ >= WIDTH) {
                            continue;
                        } else {
                            min = Math.min(d[beforeI][beforeJ], min);
                        }
                    }
                    d[i][j] = min + a[i][j];
                }
            }

            System.out.println(testcase + ". " + d[n - 1][1]);
        }
    }

    public static void main(String[] args) throws IOException {
        new P04883___TriangleGraph().solve();
    }
}
