package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01709___CircleOnTile {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int r = n / 2;
        int count = 0;
        for (int i = 1; i < r; i++) {
            long x = (long) r * r - (long) i * i;
            long y = (long) Math.sqrt(x);
            if (y * y == x) {
                count++;
            }
        }
        System.out.println((n - 1 - count) * 4);
    }

    public static void main(String[] args) throws IOException {
        new P01709___CircleOnTile().solve();
    }
}
