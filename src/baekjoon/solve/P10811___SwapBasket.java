package baekjoon.solve;

import java.util.Scanner;

public class P10811___SwapBasket {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            for (int j = from; j <= (from + to) / 2; j++) {
                int tmp = d[j];
                d[j] = d[to - (j - from)];
                d[to - (j - from)] = tmp;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(d[i] + " ");
        }
    }


    public static void main(String[] args) {
        new P10811___SwapBasket().solve();
    }
}
