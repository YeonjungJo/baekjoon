package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01407___HowManyTimesDivideByTwo {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long sum = 0;
        long before = 1;
        long current = 2;
        long beforeCount = m - n + 1;
        while (before <= m) {
            long tmp = m / current - (n - 1) / current;
            sum += before * (beforeCount - tmp);
            current *= 2;
            before *= 2;
            beforeCount = tmp;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        new P01407___HowManyTimesDivideByTwo().solve();
    }
}
