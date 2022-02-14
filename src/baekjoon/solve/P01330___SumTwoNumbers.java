package baekjoon.solve;

import java.util.Scanner;

public class P01330___SumTwoNumbers {
    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a == b ? "==" : a > b ? ">" : "<");
    }

    public static void main(String[] args) {
        new P01330___SumTwoNumbers().solve();
    }
}
