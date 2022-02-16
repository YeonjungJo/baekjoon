package baekjoon.solve;

import java.util.Scanner;

public class P10409___Server {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        int t = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
            if (sum <= t) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        new P10409___Server().solve();
    }
}
