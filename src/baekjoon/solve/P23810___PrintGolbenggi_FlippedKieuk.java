package baekjoon.solve;

import java.util.Scanner;

public class P23810___PrintGolbenggi_FlippedKieuk {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5 * n; j++) {
                result.append("@");
            }
            result.append("\n");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.append("@");
            }
            result.append("\n");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5 * n; j++) {
                result.append("@");
            }
            result.append("\n");
        }
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n; j++) {
                result.append("@");
            }
            result.append("\n");
        }
        System.out.print(result);
    }


    public static void main(String[] args) {
        new P23810___PrintGolbenggi_FlippedKieuk().solve();
    }
}
