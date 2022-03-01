package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09527___CountOne {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String[] s = br.readLine().split(" ");
        long start = Long.parseLong(s[0]);
        long end = Long.parseLong(s[1]);

        long count = 0;
        for (long i = 1; i <= end; i *= 2) {
            long a = start / i;
            long b = end / i;
            long c = start % i;
            long d = end % i;

            if (a % 2 == 0 && b % 2 == 0) {
                count += ((b - a) / 2) * i;
            }
            if (a % 2 == 1 && b % 2 == 0) {
                count += ((b - (a + 1)) / 2) * i + (i - c);
            }
            if (a % 2 == 0 && b % 2 == 1) {
                count += ((b - a) / 2) * i + (d + 1);
            }
            if (a % 2 == 1 && b % 2 == 1) {
                count += ((b - (a + 1)) / 2) * i + (i - c) + (d + 1) + (a == b ? -i : 0);
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        new P09527___CountOne().solve();
    }
}
