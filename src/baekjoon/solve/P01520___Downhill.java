package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01520___Downhill {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int[][] a = new int[height][width];
        for (int i = 0; i < height; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < width; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] d = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                d[i][j] = -1;
            }
        }

        search(d, a, 0, 0);

        System.out.println(d[0][0]);
    }

    private int search(int[][] d, int[][] a, int y, int x) {
        if (y == a.length - 1 && x == a[0].length - 1) {
            return 1;
        }
        if (d[y][x] != -1) {
            return d[y][x];
        }
        d[y][x] = 0;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX >= 0 && nextY >= 0 && nextX < a[0].length && nextY < a.length) {
                if (a[y][x] > a[nextY][nextX]) {
                    d[y][x] = d[y][x] + search(d, a, nextY, nextX);
                }
            }
        }
        return d[y][x];
    }

    public static void main(String[] args) throws IOException {
        new P01520___Downhill().solve();
    }
}
