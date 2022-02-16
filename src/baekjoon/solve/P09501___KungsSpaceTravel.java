package baekjoon.solve;

import java.util.Scanner;

public class P09501___KungsSpaceTravel {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            int distance = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int v = sc.nextInt();
                int f = sc.nextInt();
                int c = sc.nextInt();
                if (distance * c <= v * f) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }


    public static void main(String[] args) {
        new P09501___KungsSpaceTravel().solve();
    }
}
