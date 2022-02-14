package baekjoon.solve;

import java.util.Scanner;

public class P01436___NumberingNth666 {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        int count = 1;
        int a = 666;
        while (n > count) {
            a++;
            if (Integer.toString(a).contains("666")) {
                count++;
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        new P01436___NumberingNth666().solve();
    }
}
