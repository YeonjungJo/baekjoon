package baekjoon.solve;

import java.util.Scanner;

public class P11134___CookieLover {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(n / k + (n % k == 0 ? 0 : 1));
        }
    }


    public static void main(String[] args) {
        new P11134___CookieLover().solve();
    }
}
