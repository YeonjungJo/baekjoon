package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class T01520___Downhill_dp {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
        boolean[][] v = new boolean[height][width];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        d[0][0] = 1;
        v[0][0] = true;
        while (!stack.isEmpty()) {
            Integer point = stack.pop();
            int x = point / 1000;
            int y = point % 1000;
            // U
            if (y - 1 >= 0 && a[y][x] > a[y - 1][x]) {
                d[y - 1][x]++;
                if (!v[y - 1][x]) {
                    stack.add(x * 1000 + y - 1);
                }
            }
            // D
            if (y + 1 < height && a[y][x] > a[y + 1][x]) {
                d[y + 1][x]++;
                if (!v[y + 1][x]) {
                    stack.add(x * 1000 + y + 1);
                }
            }
            // L
            if (x - 1 >= 0 && a[y][x] > a[y][x - 1]) {
                d[y][x - 1]++;
                if (!v[y][x - 1]) {
                    stack.add((x - 1) * 1000 + y);
                }
            }
            // R
            if (x + 1 < width && a[y][x] > a[y][x + 1]) {
                d[y][x + 1]++;
                if (!v[y][x + 1]) {
                    stack.add((x + 1) * 1000 + y);
                }
            }
        }

        System.out.println(d[height - 1][width - 1]);
    }

    public static void main(String[] args) throws IOException {
        new T01520___Downhill_dp().solve();
    }
}
