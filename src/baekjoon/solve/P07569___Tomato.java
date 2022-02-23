package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P07569___Tomato {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static final int RAW_TOMATO = 0;
    public static final int RIPE_TOMATO = 1;

    int[] dx = {1, -1, 0, 0, 0, 0};
    int[] dy = {0, 0, 1, -1, 0, 0};
    int[] dz = {0, 0, 0, 0, 1, -1};

    private void solve() throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int h = Integer.parseInt(s[2]);

        int[][][] a = new int[h][m][n];
        Stack<Tomato> stack = new Stack<>();
        int rawTomatoCount = 0;
        for (int k = 0; k < h; k++) {
            for (int i = 0; i < m; i++) {
                String[] tmp = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    a[k][i][j] = Integer.parseInt(tmp[j]);
                    if (a[k][i][j] == RIPE_TOMATO) {
                        stack.add(new Tomato(k, i, j));
                    } else if (a[k][i][j] == RAW_TOMATO) {
                        rawTomatoCount++;
                    }
                }
            }
        }

        if (rawTomatoCount == 0) {
            System.out.println("0");
            return;
        }

        int dayCount = 0;
        while (!stack.isEmpty()) {
            stack = ripe(a, h, m, n, stack);
            dayCount++;
        }

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[k][i][j] == RAW_TOMATO) {
                        System.out.println("-1");
                        return;
                    }
                }
            }
        }

        System.out.println(dayCount - 1);
    }

    private Stack<Tomato> ripe(int[][][] a, int h, int m, int n, Stack<Tomato> stack) {
        Stack<Tomato> nextDay = new Stack<>();
        for (Tomato tomato : stack) {
            for (int i = 0; i < 6; i++) {
                int nextX = tomato.x + dx[i];
                int nextY = tomato.y + dy[i];
                int nextZ = tomato.z + dz[i];

                if (nextX >= h || nextX < 0) {
                    continue;
                }
                if (nextY >= m || nextY < 0) {
                    continue;
                }
                if (nextZ >= n || nextZ < 0) {
                    continue;
                }
                if (a[nextX][nextY][nextZ] == RAW_TOMATO) {
                    nextDay.add(new Tomato(nextX, nextY, nextZ));
                    a[nextX][nextY][nextZ] = RIPE_TOMATO;
                }
            }
        }
        return nextDay;
    }

    class Tomato {
        int x;
        int y;
        int z;

        Tomato(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException {
        new P07569___Tomato().solve();
    }
}
