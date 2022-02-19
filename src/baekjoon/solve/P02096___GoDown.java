package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class P02096___GoDown {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                points[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] max = new int[n][3];
        max[0][0] = points[0][0];
        max[0][1] = points[0][1];
        max[0][2] = points[0][2];
        int[][] min = new int[n][3];
        min[0][0] = points[0][0];
        min[0][1] = points[0][1];
        min[0][2] = points[0][2];

        for (int i = 1; i < n; i++) {
            max[i][0] = max(max[i - 1][0], max[i - 1][1]) + points[i][0];
            max[i][1] = max(max(max[i - 1][0], max[i - 1][1]), max[i - 1][2]) + points[i][1];
            max[i][2] = max(max[i - 1][1], max[i - 1][2]) + points[i][2];
            min[i][0] = min(min[i - 1][0], min[i - 1][1]) + points[i][0];
            min[i][1] = min(min(min[i - 1][0], min[i - 1][1]), min[i - 1][2]) + points[i][1];
            min[i][2] = min(min[i - 1][1], min[i - 1][2]) + points[i][2];
        }

        System.out.println(
                max(max(max[n - 1][0], max[n - 1][1]), max[n - 1][2]) + " " + min(min(min[n - 1][0], min[n - 1][1]), min[n - 1][2])
        );
    }

    public static void main(String[] args) throws IOException {
        new P02096___GoDown().solve();
    }
}
