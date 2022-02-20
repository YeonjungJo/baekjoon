package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P02168___DiagonalOnTile {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // find gcd
        int gcd = 1;
        for (int i = 2; i <= Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                gcd *= i;
                x /= i;
                y /= i;
                i--;
            }
        }

        System.out.println((x + y - 1) * gcd);
    }

    public static void main(String[] args) throws IOException {
        new P02168___DiagonalOnTile().solve();
    }
}
