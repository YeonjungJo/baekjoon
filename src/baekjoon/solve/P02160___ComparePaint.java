package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02160___ComparePaint {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[][][] paint = new boolean[n][5][7];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                String s = br.readLine();
                for (int k = 0; k < 7; k++) {
                    paint[i][j][k] = s.charAt(k) == '.';
                }
            }
        }

        int diff = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = compare(paint[i], paint[j]);
                if (tmp < diff) {
                    diff = tmp;
                    result = (i + 1) + " " + (j + 1);
                }
            }
        }

        System.out.println(result);
    }

    private int compare(boolean[][] a, boolean[][] b) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                count += a[i][j] ^ b[i][j] ? 1 : 0;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        new P02160___ComparePaint().solve();
    }
}
