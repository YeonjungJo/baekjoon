package baekjoon.solve;

import java.util.Scanner;

public class P17427___SumOfFactors {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * (n / i);
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        new P17427___SumOfFactors().solve();
    }
}
