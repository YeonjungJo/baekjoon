package baekjoon.todo;
import java.util.Scanner;
 
public class T01926___Picture_2 {
 
    /*
     * 
     * 런타임에러가 아니라 틀렸습니다.
     * ???어디가???
     *  
     */
    private static final Scanner sc = new Scanner(System.in);
    private static final int[][] DIR = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
 
    private void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] a = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sc.nextInt() == 1) a[i][j] = true;
            }
        }
 
        int cnt = 0;
        int[][] d = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j]) {
                    cnt++;
                    search(d, a, n, m, i, j, 0);
                }
            }
        }
 
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (d[i][j] > max) max = d[i][j];
            }
        }
 
        System.out.println(cnt);
        System.out.println(max);
    }
 
    private void search(int[][] d, boolean[][] a, int n, int m, int i, int j, int cost) {
        a[i][j] = false;
 
        if (d[i][j] == 0) d[i][j] = cost + 1;
 
        for (int k = 0; k < DIR.length; k++) {
            int x = i + DIR[k][0];
            int y = j + DIR[k][1];
            if (x < 0 || y < 0 || x >= n || y >= m || !a[x][y]) continue;
            search(d, a, n, m, i + DIR[k][0], j + DIR[k][1], ++cost);
        }
    }
 
    public static void main(String[] args) {
        new T01926___Picture_2().solve();
    }
}