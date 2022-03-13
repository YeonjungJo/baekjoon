package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01019___BookPage {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        long[] d = new long[10];
        int tmp = 1;
        while (tmp <= n) {
            int target = (n / tmp) % 10;

            int count = n / (tmp);
            int remain = n % (tmp);

            if (target == 0) {
                long zero = ((long) ((count / 10) - 1) * tmp) + remain + 1;
                d[0] += count >= 10 ? zero : 0;
            } else {
                d[0] += (long) (count / 10) * tmp;
            }


            for (int i = 1; i < 10; i++) {
                d[i] += (long) (count / 10) * tmp;
                if (target > i) {
                    d[i] += tmp;
                }
                if (target == i) {
                    d[i] += remain + 1;
                }
            }

            tmp *= 10;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(d[i]).append(" ");
        }
        System.out.println(stringBuilder);
//        validate(n);
    }

    public static void main(String[] args) throws IOException {
        new P01019___BookPage().solve();
    }

    private void validate(int n) {
        int[] d = new int[10];
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            while (tmp > 0) {
                d[tmp % 10]++;
                tmp /= 10;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }
}
