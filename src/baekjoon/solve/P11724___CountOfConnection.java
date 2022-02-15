package baekjoon.solve;

import java.util.Scanner;

public class P11724___CountOfConnection {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] a = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x][y] = true;
            a[y][x] = true;
        }

        int result = 0;
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                result++;
                visit(a, visited, i);
            }

        }

        System.out.println(result);
    }

    private void visit(boolean[][] a, boolean[] visited, int current) {
        visited[current] = true;
        for (int i = 1; i <= visited.length - 1; i++) {
            if (!visited[i]) {
                if (a[current][i]) {
                    visit(a, visited, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        new P11724___CountOfConnection().solve();
    }
}
