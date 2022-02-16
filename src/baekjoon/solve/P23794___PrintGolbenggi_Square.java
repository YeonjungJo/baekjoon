package baekjoon.solve;

import java.util.Scanner;

public class P23794___PrintGolbenggi_Square {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                if(i == 0 || i == n+1) {
                    System.out.print("@");
                } else {
                    if(j == 0 || j == n+1) {
                        System.out.print("@");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new P23794___PrintGolbenggi_Square().solve();
    }
}
