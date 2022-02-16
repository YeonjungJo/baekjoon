import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] r = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            r[a][b] = 1;
            r[b][a] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

            }
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
