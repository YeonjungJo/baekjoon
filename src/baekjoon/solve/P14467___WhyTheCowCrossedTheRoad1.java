package baekjoon.solve;

import java.util.Scanner;

public class P14467___WhyTheCowCrossedTheRoad1 {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        int[] d = new int[11];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            int position = sc.nextInt();

            if (d[number] == 0) {
                d[number] = position + 1;
            } else if (d[number] != position + 1) {
                d[number] = position + 1;
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        new P14467___WhyTheCowCrossedTheRoad1().solve();
    }
}
