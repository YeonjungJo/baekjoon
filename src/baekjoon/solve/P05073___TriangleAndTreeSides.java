package baekjoon.solve;

import java.util.Arrays;
import java.util.Scanner;

public class P05073___TriangleAndTreeSides {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        while (true) {
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

            if (a[0] == a[1] && a[0] == a[2]) {
                if (a[0] == 0) {
                    return;
                } else {
                    System.out.println("Equilateral");
                }
            } else {
                Arrays.sort(a);
                if (a[0] + a[1] <= a[2]) {
                    System.out.println("Invalid");
                } else {
                    if (a[0] != a[1] && a[0] != a[2] && a[1] != a[2]) {
                        System.out.println("Scalene");
                    } else {
                        System.out.println("Isosceles");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new P05073___TriangleAndTreeSides().solve();
    }
}
