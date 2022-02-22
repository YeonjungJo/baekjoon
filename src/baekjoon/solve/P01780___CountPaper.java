package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01780___CountPaper {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int MINUS_ONE = 0;
    public static final int ZERO = 1;
    public static final int ONE = 2;
    public static final int NOT_MATCH = -1;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[][] a = new int[n][n];
        int[] count = new int[3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken()) + 1;
            }
        }

        partition(a, count, 0, 0, n);

        System.out.println(count[MINUS_ONE]);
        System.out.println(count[ZERO]);
        System.out.println(count[ONE]);
    }

    private void partition(int[][] a, int[] count, int i, int j, int n) {
        int check = check(a, i, j, n);
        if (check == NOT_MATCH) {
            int next = n / 3;
            partition(a, count, i, j, next);
            partition(a, count, i, j + next, next);
            partition(a, count, i, j + 2 * next, next);
            partition(a, count, i + next, j, next);
            partition(a, count, i + next, j + next, next);
            partition(a, count, i + next, j + 2 * next, next);
            partition(a, count, i + 2 * next, j, next);
            partition(a, count, i + 2 * next, j + next, next);
            partition(a, count, i + 2 * next, j + 2 * next, next);
        } else {
            count[check]++;
        }
    }

    private int check(int[][] a, int i, int j, int n) {
        if (n == 1) {
            return a[i][j];
        }
        int target = a[i][j];
        for (int y = i; y < i + n; y++) {
            for (int x = j; x < j + n; x++) {
                if (a[y][x] != target) {
                    return NOT_MATCH;
                }
            }
        }
        return target;
    }

    public static void main(String[] args) throws IOException {
        new P01780___CountPaper().solve();
    }
}
