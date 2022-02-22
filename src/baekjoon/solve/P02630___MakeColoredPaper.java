package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P02630___MakeColoredPaper {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public static final int WHITE = 0;
    public static final int BLUE = 1;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][n];
        int[] d = new int[2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        count(a, d, 0, 0, n);
        System.out.println(d[WHITE]);
        System.out.println(d[BLUE]);
    }

    private void count(int[][] a, int[] d, int i, int j, int size) {
        if (validate(a, d, i, j, size)) {
            return;
        }
        count(a, d, i, j, size / 2);
        count(a, d, i + size / 2, j, size / 2);
        count(a, d, i, j + size / 2, size / 2);
        count(a, d, i + size / 2, j + size / 2, size / 2);
    }

    private boolean validate(int[][] a, int[] d, int startI, int startJ, int n) {
        if (n == 1) {
            d[a[startI][startJ]]++;
            return true;
        }
        int color = a[startI][startJ];
        for (int i = startI; i < startI + n; i++) {
            for (int j = startJ; j < startJ + n; j++) {
                if (a[i][j] != color) {
                    return false;
                }
            }
        }
        d[a[startI][startJ]]++;
        return true;
    }

    public static void main(String[] args) throws IOException {
        new P02630___MakeColoredPaper().solve();
    }
}
