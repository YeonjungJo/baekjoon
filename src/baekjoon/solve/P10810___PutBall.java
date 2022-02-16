package baekjoon.solve;

import java.util.Scanner;

public class P10810___PutBall {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] d = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int k = sc.nextInt();

            for (int j = from; j <= to; j++) {
                d[j] = k;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(d[i] + " ");
        }
    }


    public static void main(String[] args) {
        new P10810___PutBall().solve();
    }
}
