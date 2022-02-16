package baekjoon.solve;

import java.util.Scanner;

public class P23806___PrintGolbenggi_Mieum {

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
        for (int i = 0; i < n * 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    result.append(j == 0 || j == 4 ? "@" : " ");
                }
            }
            result.append("\n");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5 * n; j++) {
                result.append("@");
            }
            result.append("\n");
        }

        System.out.print(result);
    }


    public static void main(String[] args) {
        new P23806___PrintGolbenggi_Mieum().solve();
    }
}
